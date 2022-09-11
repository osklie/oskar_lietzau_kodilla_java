package com.kodilla.spring.calculator;

import calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addResult = calculator.add(3, 5);
        double subResult = calculator.sub(10, 3);
        double mulResult = calculator.mul(4, 7);
        double divResult = calculator.div(10, 2);

        //Then
        Assert.assertEquals(8, addResult, 0.01);
        Assert.assertEquals(7, subResult, 0.01);
        Assert.assertEquals(28, mulResult, 0.01);
        Assert.assertEquals(5, divResult, 0.01);
    }
}