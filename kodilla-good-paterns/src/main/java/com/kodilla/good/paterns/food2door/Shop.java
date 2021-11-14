package com.kodilla.good.paterns.food2door;

import java.util.List;

public interface Shop {

    String getShopName();
    List<Product> getProductsList(int quantity);
    OrderDto process(OrderRequest orderRequest);
}
