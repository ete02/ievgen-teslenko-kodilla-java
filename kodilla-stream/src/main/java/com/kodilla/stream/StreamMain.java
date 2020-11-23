package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain<text> {

    public static void main(String[] args) {
        final PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Text to Decorate", text -> text.toUpperCase());
        poemBeautifier.beautify("Text to Decorate", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Text to Decorate", text -> text.toLowerCase());
        poemBeautifier.beautify("Text to Decorate", text -> {
            if (text.length() % 2 == 0) {
                return text + "- even number of characters";
            } else {
                return text + "- odd number of characters";
            }
        });
    }
}