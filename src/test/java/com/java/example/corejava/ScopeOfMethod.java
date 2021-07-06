package com.java.example.corejava;

class Base2 {
    protected void foo() {
        System.out.println("In Super class");
    }
}

class Derived extends Base2 {
    public void foo() {
        //scope is increased //default and private are invalid // compile time error
        System.out.println("In Derived class");
    }
}

public class ScopeOfMethod {
    public static void main(String args[]) {
        Derived d = new Derived();
        d.foo();
    }
}