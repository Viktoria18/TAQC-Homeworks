package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length a of the brick: a = ");
        double a = in.nextDouble();

        System.out.print("Enter the width b of the brick: b = ");
        double b = in.nextDouble();

        System.out.print("Enter the height c of the brick: c = ");
        double c = in.nextDouble();

        System.out.print("Enter the length x of the hole: x = ");
        double x = in.nextDouble();

        System.out.print("Enter the width y of the brick: y = ");
        double y = in.nextDouble();

        System.out.print("\n");
        System.out.print("The sides of brick: a = " + a + ", \tb = " + b + ", \tc = " + c);
        System.out.print("\n");
        System.out.print("The sides of hole: x = " + x + ", \ty = " + y);

        System.out.println("\n");
        System.out.println("We will take the brick into hole by 4 sides: \n " +
                "1)horizontally (axb) \n 2)vertically (bxa) \n " +
                "3)horizontally (cxb) \n 4)vertically (bxc) ");

        System.out.print("\n");

        if (((a<x) && (b<y)) && ((b<x) && (a<y)) &&
                ((c<x) && (b<y)) && ((b<x) && (c<y))) {
            System.out.println("Hooray! The brick gets through the hole on each side!");
        } else if ((a<x) && (b<y)) {
            System.out.println("The brick gets through the hole on the side 1)");
        } else if ((b<x) && (a<y)) {
            System.out.println("The brick gets through the hole on the side 2)");
        } else if ((c<x) && (b<y)) {
            System.out.println("The brick gets through the hole on the side 3)");
        } else if ((b<x) && (c<y)) {
            System.out.println("The brick gets through the hole on the side 4)");
        } else {
            System.out.println("Ooops... The brick does not get through the hole on none side...");
        }



    }
}
