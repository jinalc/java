package com.java.example.corejava;

class A {
    public A(String s) {
        System.out.print("A");
    }

    public A() {

    }
}

public class B extends A {
    public B(String s) {
        //super();
        System.out.print("B");
    }

    public static void main(String[] args) {
        new A("C");
    }
}