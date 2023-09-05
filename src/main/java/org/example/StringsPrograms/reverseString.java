package org.example.StringsPrograms;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

class stringReverse{
    public String functionReverse(@NotNull String avg) {
        StringBuilder reverse = new StringBuilder();
        for (int i = avg.length() - 1; i >= 0; i--) {
            char j = avg.charAt(i);
            reverse.append(j);
        }
        return reverse.toString();
    }
}
class getstringvalue {
    public String functiongetString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String avg = sc.next();
       return avg;
    }
}
public class reverseString {
    public static void main(String[] args) {
        getstringvalue a1= new getstringvalue();
        String input =a1.functiongetString();
        stringReverse rev = new stringReverse();
        String output = rev.functionReverse(input);
        System.out.println("Reversed String : "+output);
    }
}