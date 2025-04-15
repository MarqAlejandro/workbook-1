package com.plurasight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       /* System.out.print("Hello, User!" +
                "\n Please input your monthly salary: ");

        int monthSalary = scanner.nextInt();

        System.out.print("\n Please input your years of experience: ");

        int yearsOfExp = scanner.nextInt();

        System.out.print("\n Please input your number of languages: ");

        int numberOfLanguages = scanner.nextInt();
        if((monthSalary <= 1000) && ((yearsOfExp <=2) || (numberOfLanguages < 2))){
            System.out.println("I want to earn more.");
            System.out.println("You're a junior developer.");
            System.out.println("To reach 10,000 per month, you'll need " + (10_000 - monthSalary) + " more.");
        } else if ((monthSalary <= 2000) && ((yearsOfExp <= 5) && (numberOfLanguages >=2))){
            System.out.println("Just getting started.");
            System.out.println("You're a medior developer");
            System.out.println("To reach 10,000 per month, you'll need " + (10_000 - monthSalary) +" more.");
        }
        else if ((monthSalary <= 5000) && ((yearsOfExp > 5) && (numberOfLanguages > 3))){
            System.out.println("Now we are talking.");
            System.out.println("You are a senior developer!");
            System.out.println("To reach 10,000 per month, you'll need " + (10_000 - monthSalary) + " more.");
        }
        else if (monthSalary == 10_000){
            System.out.println("This is what I am talking about!");
            System.out.println("You have reached 10,000 per month, congratulations!");
        }*/
        System.out.print("Hello, User!" +
                "\n Please input your username: ");


        String name = scanner.nextLine();
        System.out.print("\n Please input your password: ");

        String password = scanner.nextLine();

        if(!name.isEmpty() && (password.equals("secret123"))){
            System.out.println("Access Granted, welcome " + name);
        }
        else{
            System.out.println("Access denied - invalid credentials");
        }



    }
}