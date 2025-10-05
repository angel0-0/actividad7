package com.angel.act7;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView productsRecyclerView;
    private ProductAdapter productAdapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        productsRecyclerView = findViewById(R.id.products_recycler_view);
        productsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        loadProducts();

        productAdapter = new ProductAdapter(this, productList);
        productsRecyclerView.setAdapter(productAdapter);
    }

    private void loadProducts() {
        productList = new ArrayList<>();
        
        productList.add(new Product(
                getString(R.string.product_pikachu_image_name),
                getString(R.string.product_pikachu_name),
                getString(R.string.product_pikachu_description),
                getString(R.string.product_pikachu_url)
        ));
        productList.add(new Product(
                getString(R.string.product_tenedor_image_name),
                getString(R.string.product_tenedor_name),
                getString(R.string.product_tenedor_description),
                getString(R.string.product_tenedor_url)
        ));
        productList.add(new Product(
                getString(R.string.product_frieren_image_name),
                getString(R.string.product_frieren_name),
                getString(R.string.product_frieren_description),
                getString(R.string.product_frieren_url)
        ));
        productList.add(new Product(
                getString(R.string.product_rei_image_name),
                getString(R.string.product_rei_name),
                getString(R.string.product_rei_description),
                getString(R.string.product_rei_url)
        ));
        productList.add(new Product(
                getString(R.string.product_peine_image_name),
                getString(R.string.product_peine_name),
                getString(R.string.product_peine_description),
                getString(R.string.product_peine_url)
        ));
    }
}
