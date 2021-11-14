package com.kodilla.good.paterns.food2door;

public class OrderDto {

    private final Shop shop;
    private final boolean isOrdered;

    public OrderDto(Shop shop, boolean isOrdered) {
        this.shop = shop;
        this.isOrdered = isOrdered;
    }

    public Shop getShop() {
        return shop;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
