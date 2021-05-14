package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private String username;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(Queue queue) {
        System.out.println(username + ": task(s) need to be check - " + queue.getTaskQueue().getLast());
    }
}
