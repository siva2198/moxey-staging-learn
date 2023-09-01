package org.example.StringsPrograms;

import java.util.Scanner;

public class CharByChar {
    public static void main(String[] args) {
        System.out.println("Starts");
        Scanner sc = new Scanner(System.in);
        String inputChar = sc.next();
        for (int i=0;i<=inputChar.length()-1;i++)
        {
            char singleChar=inputChar.charAt(i);
            System.out.println(singleChar);
        }
        System.out.println("Ends");
    }
}
