package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator

import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain<text> {

    public static void main(String[] args) {
        /*ExpressionExecutor expressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);*/
    }
    // Task
    final PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify ("Text to Decorate", text -> text.toUpperCase());
        poemBeautifier.beautify("Text to Decorate", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Text to Decorate", text -> text.toLowerCase());
        poemBeautifier.beautify("Text to Decorate", text -> {
        String text;
        if (text.length() % 2 == 0) {
            return text + "- even number of characters";
        } else {
            return text + "- odd number of characters";
        }
    }
}