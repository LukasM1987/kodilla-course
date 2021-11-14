package com.kodilla.good.paterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Shop {

    private static final String SHOP_NAME = "HEALTHY SHOP";
    private List<Product> products = new ArrayList<>();


    @Override
    public String getShopName() {
        return SHOP_NAME;
    }

    @Override
    public List<Product> getProductsList(int quantity) {
        products.add(new Product("Product 1", quantity, 7.79));
        products.add(new Product("Product 2", quantity, 6.79));
        products.add(new Product("Product 3", quantity, 5.79));
        products.add(new Product("Product 4", quantity, 4.79));
        return products;
    }

    @Override
    public OrderDto process(OrderRequest orderRequest) {
        if (orderRequest.getShop().getShopName().equals(SHOP_NAME)) {
            OrderProcessor orderProcessor = new OrderProcessor(new ProductOrderService(), new OrderRepositoryService());
            return orderProcessor.process(orderRequest);
        }
        return new OrderDto(orderRequest.getShop(), false);
    }
}
