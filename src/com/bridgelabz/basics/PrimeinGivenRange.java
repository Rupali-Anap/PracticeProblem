package com.bridgelabz.basics;

import java.util.Scanner;

public class PrimeinGivenRange {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int prime1, prime2, i, j, flag;

        System.out.println("Enter First interval: ");
        prime1 = sc.nextInt();

        System.out.println("Enter Second interval: ");
        prime2 = sc.nextInt();

        System.out.println("Prime number between Range is:");
        for (i = prime1; i <= prime2; i++) {
            if (i == 1 || i == 0)
                continue;

            flag = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
}

