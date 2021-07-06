package com.java.example.Java8.supplier;

import com.java.example.oops.misc.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExampleProduct {
    public static void main(String[] args) {
        Product p1 = new Product("Shoes", 800, "Footwear", "A");
        Product p2 = new Product("Belt", 200, "Accessories", "A");
        Product p3 = new Product("Iron", 500, "Electronics", "A");
        Product p4 = new Product("Laptop", 20000, "Electronics", "A");
        Product p5 = new Product("Mobile", 2000, "Electronics", "A");
        Product p6 = new Product("Charger", 40, "Electronics", "A");
        Product p7 = new Product("Top", 1000, "Clothing", "A");
        Product p8 = new Product("Shirt", 2000, "Clothing", "A");
        Product p9 = new Product("Ring", 5000, "Jewellery", "A");
        Product p10 = new Product("TV", 20000, "Electronics", "A");

        List<Product> products = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));
        System.out.println(products);

        System.out.println("Write a supplier to produce a random product: ");
        Random r = new Random();
        int a = r.nextInt(11);

        Supplier<Product> supplier = () -> {
            return new Product("Jinal", 27, "Programmer", "P");
        };
        Product p = supplier.get();
        System.out.println(p);

        Supplier<Integer> otp = () -> {
            return new Random().nextInt(9999);
        };

        System.out.println("Random OTP: " + String.format("%04d", r.nextInt(10000)));
    }
}