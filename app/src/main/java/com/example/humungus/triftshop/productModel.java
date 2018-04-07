package com.example.humungus.triftshop;

public class productModel {

    private String thumbnail;
    private String productTitle;
    private String productDescription;
    private int stock;
    private int price;

    public productModel() {
    }

    public productModel(String thumbnail, String productTitle, String productDescription, int stock, int price) {
        this.thumbnail = thumbnail;
        this.productTitle = productTitle;
        this.productDescription = productDescription;
        this.stock = stock;
        this.price = price;
    }


//    getters
    public int getThumbnail() {
        return Integer.parseInt(thumbnail);
    }

    public String getProductTitle() {
        return productTitle;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }


//    setters
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
