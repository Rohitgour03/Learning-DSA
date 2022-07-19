package com.rohit;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isPrime(num));
    }

    static boolean isArmstrong(int num){
        int sum = 0;
        int cube;
        while(num>0) {
            int rem = num%10;
            cube = rem*rem*rem;
            sum = cube;
            num = num/10; 
        }
        return sum == num;
    }
    static boolean isPrime(int n){
        if(n < 1){
            return false;
        }
        int c = 2;
        while( c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
