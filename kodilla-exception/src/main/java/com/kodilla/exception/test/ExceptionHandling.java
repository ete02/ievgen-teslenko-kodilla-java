package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(4.3, 3.4);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("There is an error! Exception: " + e);
        } finally {
            System.out.println("End of test");
        }
    }
}
