package com.plurasight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, World!");

        Client[] clients = {
            new Client("Ronald", "McDonald", "McDonalds", "RMcD@mcd.com", "415-245-5114"),
            new Client("Jack", "Indavox", "Jack-In-The-Box", "JitB@jitb.com", "323-651-2356"),
            new Client("Carl", "Indavox Jr.", "Carls Jr.", "CJ@cj.com", "651-548-9452"),
        };


        System.out.println("What would you like to do?" +
                "\n1.Show all business names" +
                "\n2.Show all email addresses");
        int userInput = scanner.nextInt();

        String formattedname = "";
        int amountofclients = clients.length;

        if(userInput == 1){
            for (int i = 0; i < amountofclients ; i++) {
                System.out.println("\ncounter: " + i);
                formattedname  = clients[i].getBusinessName();
                System.out.println(formattedname);
                System.out.println();
            }

        }
        else if(userInput == 2) {
            for (int i = 0; i < amountofclients; i++) {
                System.out.println("\ncounter: " + i);
                formattedname = clients[i].getEmailAddress();
                System.out.println(formattedname);
                System.out.println();
            }
        }

    }
}