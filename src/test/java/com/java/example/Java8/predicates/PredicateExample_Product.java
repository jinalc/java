package com.java.example.Java8.predicates;

import com.java.example.oops.misc.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample_Product {

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

        System.out.println("the price of given product is greater than 1000");
        Predicate<Product> pre = p -> p.getPrice() > 1000;
        products.stream().filter(pre).forEach(System.out::println);
        System.out.println();

        System.out.println("the product is of electronics category");
        pre = p -> p.getCategory().equals("Electronics");
        products.stream().filter(pre).forEach(System.out::println);
        System.out.println();

        System.out.println("if the product price is greater than 100/- which are in electronics category");
        pre = p -> p.getPrice() > 100 && p.getCategory().equals("Electronics");
        products.stream().filter(pre).forEach(System.out::println);
        System.out.println();

        System.out.println("if the product price is greater than 100/- or product is in electronics category.");
        pre = p -> p.getPrice() > 100 || p.getCategory().equals("Electronics");
        products.stream().filter(pre).forEach(System.out::println);
        System.out.println();

        System.out.println("if the product price is less than 100/- and product is in electronics category");
        pre = p -> p.getPrice() < 100 && p.getCategory().equals("Electronics");
        products.stream().filter(pre).forEach(System.out::println);
        System.out.println();

    }
}
