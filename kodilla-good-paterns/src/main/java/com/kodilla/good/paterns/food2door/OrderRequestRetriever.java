package com.kodilla.good.paterns.food2door;

public class OrderRequestRetriever {

    private Product product;

    public OrderRequest retrieve(Shop shop, int quantity, int productNumber) {
        product = shop.getProductsList(quantity).get(productNumber);
        print(shop.getShopName(), product.getName(), product.getQuantity(), product.getPrice());
        return new OrderRequest(shop, product);
    }

    private void print(String shopName, String productName, int productQuantity, double productPrice) {
        System.out.println("Shop: " + shopName);
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + productQuantity);
        System.out.println("Price: " + (productPrice * productQuantity));
    }
}
