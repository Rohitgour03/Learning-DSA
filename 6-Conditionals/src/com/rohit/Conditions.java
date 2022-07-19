package com.rohit;

public class Conditions {
    public static void main(String[] args) {

        int salary = 20000;
        if(salary >= 20000){
            salary = salary + 2000;
        } else{
            salary = salary + 500;
        }
        System.out.println(salary);
    }
}