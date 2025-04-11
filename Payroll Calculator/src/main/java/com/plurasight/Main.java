package com.plurasight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, User!");
        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How many hours have you worked");
        float hours = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("What is your payrate?");
        float payrate = scanner.nextFloat();
        scanner.nextLine();

        float pay = payrate * hours;

        float overtimeHours;
        double overtimePay = 0;
        double totalPay = 0;

        if(hours > 40){
            overtimeHours = hours - 40;
            overtimePay = overtimeHours * (payrate * 1.5);
            totalPay = overtimePay + pay;

        }

        System.out.print("name: " + name + "\nPay: ");
        System.out.printf("%.2f" ,pay);
        System.out.println();

        if (overtimePay > 0){
            System.out.println("\nCongradulations! You made overtime pay.\n");
            System.out.print("Overtime Pay: ");
            System.out.printf("%.2f",overtimePay);
            System.out.print("\nTotal: ");
            System.out.printf("%.2f", totalPay);
            System.out.println();


        }

    }
}