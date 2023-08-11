package org.example;

class Calculator{
    public int add(int a, int b){
        int r1 =a+b;
    return r1;
    }
    public void sub(int a,int b){
        int r2 = a-b;
        double rd2 = r2;
        System.out.println(rd2);
    }
}
public class addtwocomplex {
    public static void main(String[] args) {
        int n1=5;
        int n2=5;
        Calculator check = new Calculator();
        System.out.println("Starting of the program");
        int result = check.add(n1,n2);
        System.out.println(result);
        System.out.println("End of the program");
       check.sub(n1,n2);
    }
}
