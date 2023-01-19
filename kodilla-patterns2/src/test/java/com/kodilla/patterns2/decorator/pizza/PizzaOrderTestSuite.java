package com.kodilla.patterns2.decorator.pizza;

import decorator.pizza.BasicPizzaOrder;
import decorator.pizza.HamDecorator;
import decorator.pizza.PineappleDecorator;
import decorator.pizza.PizzaOrder;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);

    }

     @Test
    public void TestPizzaHawaiianGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PineappleDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(23).setScale(2), calculatedCost.setScale(2));

    }

    @Test
    public void TestPizzaHawaiianGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PineappleDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Your ordered pizza + pineapple + ham", description);
    }
}