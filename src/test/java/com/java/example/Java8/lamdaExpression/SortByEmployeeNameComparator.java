package com.java.example.Java8.lamdaExpression;

import com.java.example.oops.misc.Employee;

import java.util.ArrayList;
import java.util.List;

public class SortByEmployeeNameComparator {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jon", 22, 1001));
        employees.add(new Employee("Steve", 19, 1003));
        employees.add(new Employee("Kevin", 23, 1005));
        employees.add(new Employee("Ron", 20, 1010));
        employees.add(new Employee("Lucy", 18, 1111));

        System.out.println();
        System.out.println("Before Sorting the Employee data:");
        employees.forEach((s) -> System.out.println(s));


        System.out.println();
        System.out.println("After Sorting the Employee data by Age:");
        employees.sort((Employee s1, Employee s2) -> s1.getAge() - s2.getAge());
        employees.forEach((s) -> System.out.println(s));


        System.out.println();
        System.out.println("After Sorting the Employee data by Name:");
        employees.sort((Employee s1, Employee s2) -> s1.getName().compareTo(s2.getName()));
        employees.forEach((s) -> System.out.println(s));


        System.out.println();
        System.out.println("After Sorting the Employee data by Id:");
        employees.sort((Employee s1, Employee s2) -> s1.getId() - s2.getId());
        employees.forEach((s) -> System.out.println(s));
    }
}
