package com.java.example.Java8.primitiveInterface;

import java.util.List;
import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimitiveInterface_Product {
    public static void main(String[] args) {

        System.out.println("Write an IntPredicate to verify if the given number is a prime number: ");
        IntStream stream = IntStream.range(1, 20);

        List<Integer> primeNumbers = stream.filter(PrimitiveInterface_Product::isPrime)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(primeNumbers);

        System.out.println("Write an IntConsumer to print square of the given number 3: ");
        IntConsumer squareIt = a -> System.out.println(a * a);
        squareIt.accept(3);

        System.out.println("Write an IntSupplier to give random int below 5000:  ");
        Random r = new Random();
        IntSupplier sup = () -> r.nextInt(5000);
        System.out.println(sup.getAsInt());
    }

    static boolean isPrime(int i) {
        IntPredicate isDivisible = index -> i % index == 0;
        return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
    }
}
