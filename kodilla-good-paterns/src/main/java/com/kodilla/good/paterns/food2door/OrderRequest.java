package com.kodilla.good.paterns.food2door;

public class OrderRequest {

    private final Shop shop;
    private final Product product;

    public OrderRequest(Shop shop, Product product) {
        this.shop = shop;
        this.product = product;
    }

    public Shop getShop() {
        return shop;
    }

    public Product getProduct() {
        return product;
    }
}
