package com.java.example.Java8.functions;

import com.java.example.oops.misc.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionsExample_Product {
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


        System.out.println("calculate the cost of all products in a given list of products: ");
        Function<List<Product>, Integer> adder = c -> {
            int cost = 0;
            for (Product n : c) {
                cost = cost + n.getPrice();
            }
            return cost;
        };
        System.out.println(adder.apply(products));

        System.out.println("print all products whose prices is > 1000/- in the given list of products: ");
        Function<List<Product>, List<Product>> cost = c -> {
            List<Product> l = new ArrayList<>();
            for (Product p : c) {
                if (p.getPrice() > 1000) {
                    l.add(p);
                }
            }
            return l;
        };
        System.out.println(cost.apply(products));

        System.out.println("calculate the cost of all electronic products in the given list of products: ");
        Function<List<Product>, Integer> electronics = c -> {
            int cost1 = 0;
            for (Product p : c) {
                if (p.getCategory().equals("Electronics")) {
                    cost1 += p.getPrice();
                }
            }
            return cost1;
        };
        System.out.println(electronics.apply(products));

        System.out.println("get all the products whose price is is > 1000/- and belongs to electronic category: ");
        Function<List<Product>, List<Product>> list = c -> {
            List<Product> l = new ArrayList<>();
            for (Product p : c) {
                if (p.getCategory().equals("Electronics") && p.getPrice() > 1000) {
                    l.add(p);
                }
            }
            return l;
        };
        System.out.println(list.apply(products));
    }
}
