package com.bridgelabz.basics;

import java.util.Scanner;

public class FirstNNaturalSum {

    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n ;
            int sum ;
            n= sc.nextInt();
            sum= n;
            for (int i = 1; i <= n; i++)
                sum += i;
            System.out.println ("First N Numbers sum is:" +sum);
        }
    }


