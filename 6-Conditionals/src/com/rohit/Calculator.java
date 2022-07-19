package com.rohit;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer = 0;
        // Take input from the user until user presses 'X'

        while(true){
            System.out.println("Enter the Operator:");
            char operator = in.next().trim().charAt(0);
                    if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
                        System.out.println("Enter two numbers");
                        int num1 = in.nextInt();
                        int num2= in.nextInt();

                        if(operator == '+'){
                            answer = num1 + num2;
                        }
                        if(operator == '-'){
                            answer = num1 - num2;
                        }
                        if(operator == '*'){
                            answer = num1 * num2;
                        }
                        if(operator == '/'){
                            answer = num1 / num2;
                        }
                        if(operator == '%'){
                            answer = num1 % num2;
                        }
                    } else if(operator == 'x' || operator == 'X'){
                        break;
                    } else {
                        System.out.println("Invalid operation");
                    }
            System.out.println(answer);

        }
        System.out.println();
    }
}
