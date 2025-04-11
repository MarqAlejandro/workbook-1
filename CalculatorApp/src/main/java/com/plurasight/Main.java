package com.plurasight;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, User!");

        System.out.print("Enter number 1: ");
        float number1 = scanner.nextFloat();
        System.out.print("Enter number 2: ");
        float number2 = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Possible calculations: \n" +
                "(A)dd \n" +
                "(S)ubtract \n" +
                "(M)ultiply \n" +
                "(D)ivide \n" +
                "Please select an option: ");
        String userChoice = scanner.nextLine();
        boolean correctChoice = false;

        while(!correctChoice) {
            if (userChoice.equalsIgnoreCase("A")){
                float sum = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + sum);
                correctChoice = true;
            } else if (userChoice.equalsIgnoreCase("S")) {
                float difference = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + difference);
                correctChoice = true;
            } else if (userChoice.equalsIgnoreCase("M")) {
                float product = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + product);
                correctChoice = true;
            } else if (userChoice.equalsIgnoreCase("D")) {
                float quotient = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + quotient);
                correctChoice = true;
            } else {
                System.out.println("You have made a wrong choice. Enter another choice: ");
                userChoice = scanner.nextLine();

            }
        }


    }
}