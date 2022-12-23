package com.bridgelabz.basics;
public class SumofGivenRange {

        public static void main (String[]args)
        {
            int a,b,sum;
            a=30;
            b=35;
            sum=0;
           // sum=a+b;
            for (int i = a; i <= b; i++)
                sum = sum + i;
            System.out.println ("The sum is " + sum);
        }
    }

