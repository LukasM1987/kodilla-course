package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements PizzaOrder {

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getDescription() {
        return "Pizza with standard pizza dough, tomato sos and mozzarella cheese";
    }
}
