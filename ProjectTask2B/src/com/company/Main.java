package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter at least a four-digit natural number n = ");
        int n = sc.nextInt();
        int n_temp = n % 10;
        n = n / 10;

        while (n >= 1) {
            n_temp = n_temp * 10;
            n_temp = n_temp + (n % 10);
            n = n / 10;
        }
        System.out.println("The reverse order of the digits: " + n_temp);
    }
}
