package com.kodilla.stream;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.person.People;
import com.kodilla.stream.book.BookDirectory;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import com.kodilla.stream.book.Book;

public class StreamMain<text> {

    public static void main(String[] args) {
        /*final SaySomething saySomething = new SaySomething();
        saySomething.say();*/
        /*final Processor processor = new Processor();
        final ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);*/

        /*fianl Processor processor = new Processor();
        final Executor codeToExecute = () -> System.out.println("bbb");
        processor.execute(codeToExecute);*/

        /*final Processor processor = new Processor();
        processor.execute(() -> System.out.println("bbb"));*/

        /*final ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a / b);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::subAFromB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::divideAByB);*/

        /*final PoemBeautifier poemBeautifier = new PoemBeautifier();

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
    }*/
       /* System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20); */

        /*People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0,s.indexOf(' ')+ 2) + ".")
                .filter(s -> s.substring(0,1).equals("M"))
                .forEach(System.out::println); */

        /* BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println); */

        /*BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);  */

        /* BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println); */

        /*BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]

        System.out.println(theResultStringOfBooks);*/

        Forum forum = new Forum();

        Map theResultOfUserMap = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getNumberOfPosts() > 1)
                .filter(forumUser -> {
                    Period period = Period.between(forumUser.getBirthDate(), LocalDate.now());
                    int ageOfUser = period.getYears();
                    return ageOfUser >= 20;
                })
                .collect(Collectors.toMap(ForumUser::getUserId, ForumUser::getUsername));

        System.out.println(theResultOfUserMap);
    }
}