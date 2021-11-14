package com.kodilla.good.paterns.food2door;

public class Food2Door {

    public static void main(String[] args) {
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve(glutenFreeShop, 6, 2);

        Shop shop = orderRequest.getShop();
        shop.process(orderRequest);
    }
}
