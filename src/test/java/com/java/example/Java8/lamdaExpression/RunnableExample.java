package com.java.example.Java8.lamdaExpression;

public class RunnableExample {
    public static void main(String[] args) {

        Runnable task2 = () -> {
            System.out.println("Task #2 is running");
        };
        new Thread(task2).start();
    }
}
