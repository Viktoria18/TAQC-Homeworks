package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of flower bed R = ");
        int R = sc.nextInt();

        double pi = 3.14;
        double S = pi * R * R;
        double P = 2 * pi * R;

        System.out.println("The radius of flower bed: R = " + R);
        System.out.println("The area of flower bed: S = " + S);
        System.out.println("The perimeter of flower bed: P = " + P);
    }
}
