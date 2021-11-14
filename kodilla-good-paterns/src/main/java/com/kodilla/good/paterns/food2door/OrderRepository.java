package com.kodilla.good.paterns.food2door;

public interface OrderRepository {
    boolean createOrder(Shop shop, Product product);
}
