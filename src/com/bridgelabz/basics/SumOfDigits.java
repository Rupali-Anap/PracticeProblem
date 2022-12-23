package com.bridgelabz.basics;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        int digit;
        int sum = 0;
        while (num > 0) {
            digit = num % 10;

            sum = sum + digit;

            num = num / 10;
        }
        System.out.println("Sum of Digits: " + sum);
    }
}