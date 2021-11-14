package com.kodilla.good.paterns.food2door;

public class OrderProcessor {

    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(OrderService orderService, OrderRepository orderRepository) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getShop(), orderRequest.getProduct());
        if (isOrdered) {
            orderRepository.createOrder(orderRequest.getShop(), orderRequest.getProduct());
            System.out.println("The order has been processed.");
            return new OrderDto(orderRequest.getShop(), true);
        } else {
            System.out.println("Unfortunately, the order cannot be processed.");
            return new OrderDto(orderRequest.getShop(), false);
        }
    }
}
