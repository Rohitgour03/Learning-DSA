package com.rohit;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
//        fun(5);
//        fun("Rohit");
        pro("ROhit", "GOur");
    }

    static void pro(int ...a){
        System.out.println(Arrays.toString(a));
    }

    static void pro(String ...s){
        System.out.println(Arrays.toString(s));
    }
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String s){
        System.out.println("Hello " + s);
    }
}
