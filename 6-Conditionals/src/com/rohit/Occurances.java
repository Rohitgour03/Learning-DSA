package com.rohit;

import java.util.Scanner;

public class Occurances {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int digitCount = 0;
        while(num>0){
                int rem = num%10;
                if(rem == 5){
                    count++;
                }
                num = num/10;
        }
        System.out.println(count);
    }
}
