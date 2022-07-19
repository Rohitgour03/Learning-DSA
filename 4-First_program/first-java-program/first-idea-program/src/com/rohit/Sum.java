package com.rohit;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum;
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        sum = num1 + num2;

        System.out.println(sum);
    }
}
