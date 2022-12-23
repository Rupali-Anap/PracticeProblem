package com.bridgelabz.basics;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter No:");
        int num= sc.nextInt();

        int reverseno=0,reminder;

        for( ;num != 0; num = num/10)
        {
            reminder = num % 10;
            reverseno = reverseno * 10 + reminder;
        }

        //output
        System.out.println ("Reversed Number: " + reverseno);
    }
}


