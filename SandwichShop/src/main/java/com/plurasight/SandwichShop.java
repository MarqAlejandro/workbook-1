package com.plurasight;

import java.util.Scanner;

public class SandwichShop {
    static Scanner scanner = new Scanner(System.in);

    private int userInput;
    private int userAge;
    private double sandwichPrice;
    private double discount;
    private final double TAX = 0.0825;
    private boolean inputValid = false;

    public void Selection(){

        System.out.println("Welcome, please make a sandwich selection. 1 for regular, 2 for large");
        userInput = scanner.nextInt();

        while(!inputValid) {
            if (userInput == 1) {                            //user chose regular
                inputValid = true;
                System.out.println("Regular size is $5.45.");
                sandwichPrice = 5.45;
                displayTotal();

            } else if (userInput == 2) {                      //user chose large
                inputValid = true;
                System.out.println("Large size is $8.95.");
                sandwichPrice = 8.95;
                displayTotal();

            } else {                                         //user input incorrect option
                System.out.println("incorrect response, please start over.");
                userInput = scanner.nextInt();
            }
        }

    }

    public double Discount(){   //get age and determine discount
        System.out.println("\nLooking for discounts... How old are you?");
        userAge = scanner.nextInt();

        if(userAge <= 17){
            return 0.10;
        }
        else if(userAge >= 65){
            return 0.20;
        }
        else{
            return 0.0;
        }
    }

    public double Total(){
        double amountTakenOff = sandwichPrice * discount;

        return sandwichPrice +((sandwichPrice - amountTakenOff) * TAX);
    }

    public void displayTotal(){
       // scanner.nextLine();
        discount = Discount();
        if (discount > 0.0) {
            if(discount == 0.1){
                System.out.println("Applying Student Discount: you get 10% off!");
            }
            else {
                System.out.println("Applying Senior Discount: you get 20% off!");
            }
        }
        else{
            System.out.println("Looks like there's no discount to apply for today.");
        }

        System.out.printf("\nTotal today is: %.2f", Total());


    }
}
