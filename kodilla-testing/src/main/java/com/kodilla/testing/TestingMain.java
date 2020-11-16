package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;
public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        // Tests for calculator
        System.out.println("Test pierwszy jednostkowy");
        Calculator calculator=new Calculator();
        int a=8;
        int b=3;

        if(calculator.add(a,b)==(a+b)){
            System.out.println("Test is working");
        }else{
            System.out.println("test OK");
        }
        System.out.println("Error!");
        if(calculator.subtract(a,b)==(a-b)){
            System.out.println("test Ok");
        }else {
            System.out.println("Error!");
        }

    }
}