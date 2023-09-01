package org.example;

import java.util.Scanner;

public class checkreturn {
    public static boolean truestatement(int a) {
        int a1 = a;
        if (a1 <= 50) {
            System.out.println("The " + a1 + " number is less than 50");
        } else if (a1 >= 100) {
            System.out.println("The " + a1 + " number is greater than 50 less than 100");
        }
        return false;
    }

    public static void falsestatement(int a) {
        int b1 = a;
        System.out.println("Square root of " + b1 + " = " + (b1 * b1));

    }

    public static void main(String[] args) {
        System.out.println("Inside main method");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //char b = sc.next().charAt(0);
        boolean x = truestatement(a);
        if (x == false) {
            falsestatement(a);
        } else if(x==true){
            System.out.println("Sorry no square root");
        }
    }
}




