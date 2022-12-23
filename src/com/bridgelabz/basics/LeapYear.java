package com.bridgelabz.basics;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year:");
        int year= sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("This is Leap Year");
        }
        else if (year % 4 == 0 && year % 100 != 0){
            System.out.println("This Is Leap Year");
        }
        else {
            System.out.println("This is not Leap Year:");
        }
    }
}
