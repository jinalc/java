package com.java.example.oops;

import com.java.example.oops.customException.InvalidEntryException;
import com.java.example.oops.utility.BouquetCost;

import java.util.Arrays;
import java.util.Scanner;

public class RunnerCalculatePrice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BouquetCost bouquetCost = new BouquetCost();
        int cost;
        try {
            System.out.println("Enter flower names you want in bouquet (comma separated) : Rose-1, Jasmin-2, Lily-3");
            String str = sc.nextLine();

            String[] flowers = str.split("[,]", 0);
            System.out.println("you have selected " + Arrays.toString(flowers));

            if (flowers.length > 0) {
                cost = bouquetCost.totalBouquetCost(flowers);
                System.out.println("Total cost of bouquet is : " + cost);

            } else {
                throw new InvalidEntryException("Invalid Input (rose, lily, jasmin)");
            }
        } catch (InvalidEntryException e) {
            System.out.println("Exception occurred: " + e);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}
