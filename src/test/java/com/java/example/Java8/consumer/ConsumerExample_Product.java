package com.java.example.Java8.consumer;

import com.java.example.oops.misc.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample_Product {
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

        System.out.println("update the grade of the product as 'Premium' if the price is > 1000/-: ");
        Consumer<List<Product>> update = list ->
        {
            for (Product p : list) {
                if (p.getPrice() > 1000)
                    p.setCategory("P");
            }
        };

        Consumer<List<Product>>
                displayList = list -> list.stream().forEach(a -> System.out.print(a));
        update.accept(products);
        displayList.accept(products);
        System.out.println();

        System.out.println("update the name of the product to be suffixed with '*' if the price of product is > 3000/-: ");
        Consumer<List<Product>> update2 = list ->
        {
            for (Product p : list) {
                if (p.getPrice() > 3000)
                    p.setName(p.getName() + "*");
            }
        };

        Consumer<List<Product>>
                displayList2 = list -> list.stream().forEach(a -> System.out.print(a));
        update2.accept(products);
        displayList2.accept(products);
        System.out.println();

        System.out.println("Print all the Premium grade products with name suffixed with '*': ");
        Predicate<Product> pre = p -> p.getName().contains("*");
        Consumer<List<Product>>
                displayList3 = list -> list.stream().filter(pre).forEach(System.out::println);
        displayList3.accept(products);
    }
}
