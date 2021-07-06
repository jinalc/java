package com.java.example.oops.utility;


import com.java.example.oops.enums.EnumPrice;

import java.util.Scanner;

public class BouquetCost implements BouquetCostCalculator {
    public int totalBouquetCost(String[] flowers) {
        int numRoses = 0;
        int numLilies = 0;
        int numJasmins = 0;
        Scanner sc = new Scanner(System.in);

        for (String flower : flowers) {

            if (flower.trim().equalsIgnoreCase("rose")) {
                System.out.println("How many Roses you want?");
                numRoses = sc.nextInt();

            } else if (flower.trim().equalsIgnoreCase("lily")) {
                System.out.println("How many Lilies you want?");
                numLilies = sc.nextInt();

            } else if (flower.trim().equalsIgnoreCase("jasmin")) {
                System.out.println("How many Jasmins you want?");
                numJasmins = sc.nextInt();
            } else {
                System.out.println("Invalid Input (rose, lily, jasmin)");
            }

        }
        return numRoses * EnumPrice.ROSE.getPrice() + numLilies * EnumPrice.LILY.getPrice() + numJasmins * EnumPrice.JASMIN.getPrice();
    }
}
