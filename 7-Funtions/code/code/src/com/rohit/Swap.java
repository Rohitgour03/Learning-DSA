package com.rohit;

public class Swap {
    public static void main(String[] args) {

        int a = 10;
        int b = 50;

//        int temp = a;
//        a = b;
//        b = temp;

//        swap(a, b);
//        System.out.println(a + " " + b);

        String name = "Rohit Gour";
        changeName(name);
        System.out.println(name);

    }

    private static void changeName(String name) {
        name = "Nanu";
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
