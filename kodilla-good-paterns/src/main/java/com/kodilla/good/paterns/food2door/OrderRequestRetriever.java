package com.kodilla.good.paterns.food2door;

public class OrderRequestRetriever {

    private Product product;

    public OrderRequest retrieve(Shop shop, int quantity, int productNumber) {
        product = shop.getProductsList(quantity).get(productNumber);
        System.out.println("Shop: " + shop.getShopName());
        System.out.println("Product: " + product.getName());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Price: " + (product.getPrice() * product.getQuantity()));
        return new OrderRequest(shop, product);
    }
}
