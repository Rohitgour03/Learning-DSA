package com.rohit;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
            Syntax
            for (initialization; condition; increment/decrement){
                // body
            }
        */

//        for(int r=1; r<5; r++){
//            System.out.println("Har Har Mahadev!!");
//        }

        //   Print numbers from 1 and 5
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int num = 0; num < n; num++) {
//            System.out.print(num + " ");
//        }

//        int num = 1;
//        while (num <= 5){
//            System.out.print(num + " ");
//            num++;
//        }

        /*
            Syntax
            do{
                // body
            } while(condition)
        */

        int num = 1;
        do {
            System.out.println(num);
        } while(num <= 5);


    }
}
