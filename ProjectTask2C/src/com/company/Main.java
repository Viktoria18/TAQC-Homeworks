package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter at least a four-digit natural number n = ");
        String str = sc.nextLine();
        System.out.println("n = " + str);

        str = str.substring(str.length() - 1) +
                str.substring(1, str.length() - 1) +
                str.charAt(0);

        System.out.println("n_new = " + str);
    }
}
