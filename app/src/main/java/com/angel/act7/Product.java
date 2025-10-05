package com.angel.act7;

public class Product {
    private final String imageName;
    private final String name;
    private final String description;
    private final String url;

    public Product(String imageName, String name, String description, String url) {
        this.imageName = imageName;
        this.name = name;
        this.description = description;
        this.url = url;
    }

    public String getImageName() {
        return imageName;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }
}
