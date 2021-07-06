package com.java.example.Java8.constuctorReference;

import com.java.example.oops.misc.Employee;
import com.java.example.oops.misc.MethodReference;

public class ConstructorReferenceExample_Employee {
    public static void main(String[] args) {
        MethodReference hello = Employee::new;
        hello.getEmployee("Jinal", 27, 123, 123456, 10000);
        System.out.println(hello.getEmployee("Jinal", 27, 123, 123456, 10000).getName());
    }
}
