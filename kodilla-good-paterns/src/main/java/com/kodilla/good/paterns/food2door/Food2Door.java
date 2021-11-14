package com.kodilla.good.paterns.food2door;

public class Food2Door {

    public static void main(String[] args) {
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        OrderRequestRetriever ordersRequestRetriever = new OrderRequestRetriever();
        OrderRequest ordersRequest = ordersRequestRetriever.retrieve(glutenFreeShop, 6, 2);

        Shop shop = ordersRequest.getShop();
        shop.process(ordersRequest);
    }
}
