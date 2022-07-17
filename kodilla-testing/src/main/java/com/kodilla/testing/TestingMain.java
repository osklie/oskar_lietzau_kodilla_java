package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void TestSimpleUser() {
      /*  SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }*/

        Calculator calculator = new Calculator();

        int a = 3;
        int b =  4;

        int subtract = a - b;
        System.out.println(subtract);

        int add = a + b;
        System.out.println(add);
    }
}
