package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SeaFoodDecorator extends AbstractPizzaOrderDecorator {

    public SeaFoodDecorator (PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(25));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " plus sea food ingredients";
    }
}
