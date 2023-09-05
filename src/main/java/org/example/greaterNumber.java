package org.example;

import java.util.Scanner;

/*Write a Java program that takes three numbers from
the user and prints the greatest number.
*/
public class greaterNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st value : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd value : ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd value :");
        int c = sc.nextInt();
        findgreaterno result = new findgreaterno();
        int end= result.check(a, b, c);
        System.out.println(end + " is the greater number");
    }
}
class findgreaterno{
    public int check(int num1,int num2,int num3){
        if(num1>num2 && num1>num3)
        {
            return num1;
        }
        else if(num2 > num3 && num2 >num1)
        {
            return num2;
        }
        else  {
            return num3;
    }
        }
    }

