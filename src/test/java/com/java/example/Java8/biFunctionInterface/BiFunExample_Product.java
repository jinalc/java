package com.java.example.Java8.biFunctionInterface;

import com.java.example.oops.misc.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunExample_Product {
    public static void main(String[] args) {

        Product p1 = new Product("Shoes", 800, "Footwear", "A");
        Product p2 = new Product("Belt", 200, "Accessories", "A");

        System.out.println("Given the name and price of the product, write a Bifunction to create a product: ");
        BiFunction<String, Integer, Product> addProduct = (a, b) -> new Product(a, b, "Clothing", "A");
        System.out.println("New Product added: " + addProduct.apply("Jeans", 1000));
        System.out.println();

        System.out.println("Given the Product and quantity of the products, write a BiFunction to calculate the cost of products");
        BiFunction<Product, Integer, Integer> calc = (a, b) -> a.getPrice() * b;
        System.out.println("Total cost: " + calc.apply(p1, 10));
        System.out.println();

        System.out.println("A cart is a map of product and quantity. Given the cart, calculate the cost of the cart: ");
        Map<Product, Integer> cart = new HashMap<>();
        cart.put(p1, 10);
        cart.put(p2, 10);
        Function<Map<Product, Integer>, Integer> costOfCart = a -> {
            int cost = 0;
            Set<Map.Entry<Product, Integer>> entrySet = a.entrySet();
            for (Map.Entry entry : entrySet) {
                Product p = (Product) entry.getKey();
                Integer quantity = (Integer) entry.getValue();
                cost = cost + p.getPrice() * quantity;
            }
            return cost;
        };
        System.out.println("Total cost of cart: " + costOfCart.apply(cart));
    }
}
