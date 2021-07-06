package com.java.example.oops.misc;

public class Person implements Comparable<Person> {

    public int rollNo;
    public String name;
    public int age;

    public Person(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person st) {
        if (age == st.age)
            return 0;
        else if (age > st.age)
            return 1;
        else
            return -1;

    }
}