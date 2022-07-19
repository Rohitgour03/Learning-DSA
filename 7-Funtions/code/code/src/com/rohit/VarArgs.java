package com.rohit;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6);
        multiple(20, 30, "Rohit", "Gour");
    }

    static void multiple(int a, int b, String ...s){
        System.out.println(a + " " + b + " " + Arrays.toString(s));
    }
    static void fun(int ...a){
        //System.out.println(Arrays.toString(a));
    }
}
