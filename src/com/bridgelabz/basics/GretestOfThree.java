package com.bridgelabz.basics;

import java.util.Scanner;

public class GretestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter no:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("This  number is greatest=" + num1);

        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("This  number is greatest=" + num2);

        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println("This  number is greatest=" + num3);
        }
    }
}