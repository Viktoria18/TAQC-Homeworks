package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("Where are you live, " + name + "? (Street/House number)");
        String address = sc.nextLine();

        System.out.print("Hello, " + name + ". Your address is " + address + ". Very good.");
    }
}
