package org.example.StringsPrograms;

import java.util.Scanner;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputChar = sc.next();
        System.out.println("Enter the passage");
        for(int i=0;i<=inputChar.length()-1;i++){
            char singleChar = inputChar.charAt(i);
            if(singleChar>='A'&& singleChar<='Z')
            {
                System.out.println("UPPERCASE");
                System.out.println(singleChar);
                System.out.println("==========");
            }
            else if (singleChar>='a' && singleChar <='z') {
                System.out.println("LOWERCASE");
                System.out.println(singleChar);
                System.out.println("==========");
            }
            else {
                System.out.println("NUMBERS");
                System.out.println(singleChar);
                System.out.println("++++++++++++++");
            }
        }

    }
}
