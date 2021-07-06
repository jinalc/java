package com.java.example.Java8.lamdaExpression;

import com.java.example.Java8.functionalInterfaces.PalindromeCheck;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("\\s+", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str = sc.nextLine();

        if (isPalindrome(str))
            System.out.println(str + " is palindrome");
        else
            System.out.println(str + " is not palindrome");

        //using function
        System.out.println("Enter any string: ");
        String str2 = sc.nextLine();

        PalindromeCheck isPalindrome = (s) -> {
            String clean = s.replaceAll("\\s+", "").toLowerCase();
            return clean.equals(new StringBuilder(clean).reverse().toString());
        };

        if (isPalindrome.isPalindrome(str2))
            System.out.print(str2 + " is palindrome");
        else System.out.print(str2 + " is not palindrome");

    }
}
