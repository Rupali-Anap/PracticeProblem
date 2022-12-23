package com.bridgelabz.basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:");
        int prime = sc.nextInt();
        if ( isPrime(prime)) {
            System.out.println("This number is Prime Number:");
        }else {
            System.out.println("This Number is Not Prime Number");

        }
    }
    public static boolean isPrime(int prime)  {
        if (prime <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(prime); i++) {
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
    }
}