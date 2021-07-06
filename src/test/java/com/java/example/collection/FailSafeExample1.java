package com.java.example.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

//Fail-Safe iterators don’t throw any exceptions if a collection is structurally modified
// while iterating over it. This is because, they operate on the clone of the collection,
// not on the original collection and that’s why they are called fail-safe iterators.
// Iterator on CopyOnWriteArrayList, ConcurrentHashMap classes are examples of fail-safe Iterator.

public class FailSafeExample1 {
    public static void main(String args[]) {
        CopyOnWriteArrayList<Integer> list
                = new CopyOnWriteArrayList<Integer>(new Integer[]{1, 3, 5, 8});
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Integer no = (Integer) itr.next();
            System.out.println(no);
            if (no == 8)

                // This will not print,
                // hence it has created separate copy
                list.add(14);
        }
    }
}
