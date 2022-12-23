package com.bridgelabz.basics;
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args){

        int num ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no:" );
        num= sc.nextInt();
        if(num>=0){
            System.out.println("The number is positive");
        }
        else
        {
        System.out.println("The number is negative");
        }
    }
}

