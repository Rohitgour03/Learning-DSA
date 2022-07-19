package com.rohit;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().trim().charAt(0);

        if (c >= 'a' && c <= 'z') {
            System.out.println("c is Lowercased");
        } else{
            System.out.println("c is uppercased");
        }
        System.out.println(c);
    }
}
