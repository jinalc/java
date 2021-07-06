package com.java.example.corejava;

class ParentChildClassDemo {
    public static void main(String[] args) {
        Base base = new Child();
        base.hello();

        Child child = new Child();
        child.hello();

        child = (Child) new Base();
        child.hello();

    }
}

class Base {
    public static void hello() {
        System.out.println("Hello from base class");
    }
}

class Child extends Base {

    public static void hello() {
        System.out.println("Hello from child class");
    }
}
