package com.bridgelabz.basics;

import java.util.Scanner;

public class FactorsOfNumber {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter No:");
            int num = sc.nextInt();
            System.out.println( "Factors of Numbers are:" );
            for(int i = 1; i <= num; i++)
            {
                if(num % i == 0)
                    System.out.println(i);
            }

        }
    }

