package com.bridgelabz.basics;

import java.util.Scanner;

public class PerfectNumber {

    public static void main (String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter No:");
        int n = sc.nextInt(), temp = 0;
        for (int i = 1; i < n; i++)
        {
            if (n % i == 0)
                temp = temp + i;
        }
        if (temp == n)
            System.out.println ("It is a Perfect number");
        else
            System.out.println ("It is not Perfect number");
    }
}

