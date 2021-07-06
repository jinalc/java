package com.java.example.collection;

import com.java.example.oops.misc.Person;

import java.util.ArrayList;
import java.util.Collections;

public class SortUsingComparable {
    public static void main(String args[]) {
        ArrayList<Person> al = new ArrayList<Person>();
        al.add(new Person(101, "Vijay", 23));
        al.add(new Person(106, "Ajay", 27));
        al.add(new Person(105, "Jai", 21));

        Collections.sort(al);
        for (Person st : al) {
            System.out.println(st.rollNo + " " + st.name + " " + st.age);
        }
    }
}
