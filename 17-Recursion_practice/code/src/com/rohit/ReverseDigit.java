package com.rohit;

public class ReverseDigit {
    public static void main(String[] args) {
        System.out.println(reverse2(12345));
    }

    static int sum = 0;

    static void reverse1(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum*10 + rem;
        reverse1(n/10);
    }

    static int reverse2(int num){
        // sometimes we might need the additional arguments so make a another function for that.
        int digits = (int)(Math.log10(num));
        return helper(num, digits);
    }

    static int helper(int num, int args){
        if(num%10 == num){
            return num;
        }
        return (int) (num%10 * Math.pow(10, args) + helper(num/10, --args));
    }
}
