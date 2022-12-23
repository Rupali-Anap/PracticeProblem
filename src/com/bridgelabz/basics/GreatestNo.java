package com.bridgelabz.basics;

import java.util.Scanner;

public class GreatestNo {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter no:");
        num1=sc.nextInt();
        num2= sc.nextInt();
        if(num1>num2){
            System.out.println("The number is greatest");
        }
        else
        {
            System.out.println("The number is smallest");
        }
    }
}
