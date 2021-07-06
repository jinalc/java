package com.java.example.oops.misc;

public class Employee {
    String name;
    int age;
    int id;


    long account;
    long salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public long getAccount() {
        return account;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Employee(String name, int age, int id, long account, long salary) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.account = account;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return ("Employee[ " + "Name:" + this.getName() +
                " Age: " + this.getAge() +
                " Id: " + this.getId() +
                " Account: " + this.getAccount() +
                " Salary: " + this.getSalary() + "]");
    }
}
