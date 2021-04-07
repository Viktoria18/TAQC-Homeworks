package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number n = ");
        int n = sc.nextInt();
        int n2 = n * n;
        System.out.println("n = " + n + "\t n^2 = " + n2);

        boolean isContain = false;

        while (n2 > 0) {
            if (n2 % 10 == 3) {
                isContain = true;
            }
            n2 = n2 / 10;
        }
        System.out.println(isContain ? "Yes, number n^2 contains digit 3" :
                "No, number n^2 does not contain digit 3");
    }
}
