package com.bridgelabz.basics;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main (String[]args)
    {
        //variables initialization
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter No:");
        int num= sc.nextInt();
        int reverse = 0, rem, temp;
        temp = num;
        //loop to find reverse number
        while (temp != 0)
        {
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        };
        if (num == reverse)
            System.out.println ("Number is Palindrome");
        else
            System.out.println ( "Number is not Palindrome");

    }
}

