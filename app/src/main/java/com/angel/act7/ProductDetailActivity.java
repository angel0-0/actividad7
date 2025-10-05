package com.angel.act7;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProductDetailActivity extends AppCompatActivity {

    public static final String EXTRA_PRODUCT_NAME = "com.angel.act7.PRODUCT_NAME";
    public static final String EXTRA_PRODUCT_DESCRIPTION = "com.angel.act7.PRODUCT_DESCRIPTION";
    public static final String EXTRA_PRODUCT_IMAGE_RES_ID = "com.angel.act7.PRODUCT_IMAGE_RES_ID";
    public static final String EXTRA_PRODUCT_URL = "com.angel.act7.PRODUCT_URL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EdgeToEdge.enable(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        View mainView = findViewById(R.id.main);

        final int initialPaddingLeft = mainView.getPaddingLeft();
        final int initialPaddingTop = mainView.getPaddingTop();
        final int initialPaddingRight = mainView.getPaddingRight();
        final int initialPaddingBottom = mainView.getPaddingBottom();

        ViewCompat.setOnApplyWindowInsetsListener(mainView, (v, windowInsets) -> {
            Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(
                initialPaddingLeft + insets.left,
                initialPaddingTop + insets.top,
                initialPaddingRight + insets.right,
                initialPaddingBottom + insets.bottom
            );
            return windowInsets;
        });

        ImageView productDetailImage = findViewById(R.id.product_detail_image);
        TextView productDetailName = findViewById(R.id.product_detail_name);
        TextView productDetailDescription = findViewById(R.id.product_detail_description);
        Button productDetailWebButton = findViewById(R.id.product_detail_web_button);

        Intent intent = getIntent();

        String productName = intent.getStringExtra(EXTRA_PRODUCT_NAME);
        String productDescription = intent.getStringExtra(EXTRA_PRODUCT_DESCRIPTION);
        int productImageResId = intent.getIntExtra(EXTRA_PRODUCT_IMAGE_RES_ID, 0);
        String productUrl = intent.getStringExtra(EXTRA_PRODUCT_URL);

        if (productName != null) {
            productDetailName.setText(productName);
        }

        if (productDescription != null) {
            productDetailDescription.setText(productDescription);
        }

        if (productImageResId != 0) {
            productDetailImage.setImageResource(productImageResId);
        } else {
            productDetailImage.setImageResource(R.drawable.ic_placeholder_image);
        }

        if (productUrl != null && !productUrl.isEmpty()) {
            productDetailWebButton.setOnClickListener(v -> {
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(productUrl));
                startActivity(webIntent);
            });
        } else {
            productDetailWebButton.setEnabled(false);
            productDetailWebButton.setText(R.string.no_website_available);
        }

        if (getSupportActionBar() != null) {
            if (productName != null) {
                getSupportActionBar().setTitle(productName);
            }
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
