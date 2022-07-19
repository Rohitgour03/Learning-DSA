package com.rohit;

public class Greeting {
    private static String name;

    public static void main(String[] args) {
//        System.out.println("Har Har Mahadev!!!");
//        greeting();

        String personalised = myGreet("Rohit gour");
    }

    static String myGreet(String name) {
        String message = "Hello" + name;
        System.out.println(message);
        return message;
    }

    static void greeting(){
        System.out.println("Hello there!!!");
    }
}
