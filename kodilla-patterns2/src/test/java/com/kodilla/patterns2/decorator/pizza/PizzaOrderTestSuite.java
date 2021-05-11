package com.kodilla.patterns2.decorator.pizza;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public  void DeliveryCost() {
        PizzaOrder order = new DeliveryService(new ExtraIngredientsDecorator(
                new ExtraIngredientsDecorator(
                        new BasicPizzaOrder(), "ham"), "bacon"));
        Assertions.assertEquals (new BigDecimal(34), order.getCost());
    }

    @Test
    public void ExtraIngredientsCost() {
        PizzaOrder order = new ExtraIngredientsDecorator(
                new ExtraIngredientsDecorator(
                        new BasicPizzaOrder(), "ham"), "meat");
        assertEquals(new BigDecimal(39), order.getCost());
    }

    @Test
    public void ExtraIngredientsGetDescription() {
        PizzaOrder order = new ExtraIngredientsDecorator(
                new ExtraIngredientsDecorator(
                        new BasicPizzaOrder(), "ham"), "bacon");
        assertEquals("Standard pizza dough, cheese, tomato sauce plus extra ingredient: ham plus extra ingredient: bacon", order.getDescription());
    }

    @Test
    public void SeaFoodGetCost() {
        PizzaOrder order = new SeaFoodDecorator(new BasicPizzaOrder());
        assertEquals(new BigDecimal(40), order.getCost());
    }

    @Test
    public void SeaFoodGetDescription() {
        PizzaOrder order = new SeaFoodDecorator(new BasicPizzaOrder());
        assertEquals("Standard pizza dough, cheese, tomato sauce plus sea food ingredients", order.getDescription());
    }
}
