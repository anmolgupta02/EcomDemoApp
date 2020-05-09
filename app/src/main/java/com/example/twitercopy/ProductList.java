package com.example.twitercopy;

public class ProductList  {

    private int mProductImage;
    private String mProductTitle;
    private String mProductManufacture;
    private String mProductPrice;

    public ProductList(int ImageResource, String ProductTitle, String ProductManufacture, String ProductPrice) {
        mProductImage = ImageResource;
        mProductTitle = ProductTitle;
        mProductManufacture = ProductManufacture;
        mProductPrice = ProductPrice;
    }

    public int getmProductImage() {
        return mProductImage;
    }

    public String getmProductTitle() {
        return mProductTitle;
    }

    public String getmProductManufacture() {
        return mProductManufacture;
    }

    public String getmProductPrice() {
        return mProductPrice;
    }
}
