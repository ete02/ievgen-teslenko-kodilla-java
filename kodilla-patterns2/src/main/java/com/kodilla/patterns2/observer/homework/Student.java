package com.kodilla.patterns2.observer.homework;

public class Student {
    private String username;
    private Queue queue;

    public Student(String username) {
        queue = new Queue();
        this.username=username;

    }

    public Queue getQueue() {
        return queue;
    }

    public String getUsername() {
        return username;
    }
}
