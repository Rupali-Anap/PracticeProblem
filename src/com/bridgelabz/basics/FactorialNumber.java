package com.bridgelabz.basics;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter No:");
        int num= sc.nextInt(), fact=1;

        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }
}
