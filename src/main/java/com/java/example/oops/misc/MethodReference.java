package com.java.example.oops.misc;

@FunctionalInterface
public interface MethodReference {
    Employee getEmployee(String name, int age, int id, long account, long salary);
}
