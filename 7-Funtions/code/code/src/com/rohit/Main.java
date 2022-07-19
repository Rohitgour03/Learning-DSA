package com.rohit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(5, 7);
        System.out.println(ans);
    }

    static int sum3(int a, int b){
        return a + b;
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1:");
        int num1 = in.nextInt();
        System.out.print("Enter the number 2:");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        return sum;
    }

     static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1:");
        int num1 = in.nextInt();
        System.out.print("Enter the number 2:");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }

    /*
        access_modifier return_type name(arguments) {
            // body
            return statement;
        }
     */
}