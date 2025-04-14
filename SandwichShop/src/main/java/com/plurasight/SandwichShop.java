package com.plurasight;

import java.util.Scanner;

public class SandwichShop {
    static Scanner scanner = new Scanner(System.in);

    private int userInput;
    private int userAge;
    private double sandwichPrice;
    private double loadedSandwichPrice;
    private double discount;
    private final double TAX = 0.0825;
    private boolean inputValid = false;

    public void StartSandwichMaking(){
        System.out.println("Welcome to Bread and Bolts, please make a sandwich selection and our robots will make you a sandwich in less than 5 minutes. \n1 for regular.\t2 for large.");
        userInput = scanner.nextInt();
        while(!inputValid) {
            if (userInput == 1) {                            //user chose regular
                inputValid = true;
                System.out.println("Regular size is $5.45.");
                sandwichPrice = 5.45;
                DisplayTotal();
            } else if (userInput == 2) {                      //user chose large
                inputValid = true;
                System.out.println("Large size is $8.95.");
                sandwichPrice = 8.95;
                DisplayTotal();
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
    public void Loaded(){
        System.out.println("\nWe can double everything for an additional cost. \nSelect 1 for yes. \tSelect 2 for no.");
        userInput = scanner.nextInt();
        if (userInput == 1){                        //if user chose regular and wants loaded then add $1
            if(sandwichPrice == 5.45){
                loadedSandwichPrice = sandwichPrice + 1.00;
                System.out.println(loadedSandwichPrice);
            }else {                                  //this assumes user chose large and wants loaded then add 1.75
                loadedSandwichPrice = sandwichPrice + 1.75;
                System.out.println(loadedSandwichPrice);
            }
        }
        else{                                       //if user chose no then there will be no additional charge
            loadedSandwichPrice = sandwichPrice + 0.0;
            System.out.println(loadedSandwichPrice);
        }
    }
    public double Total(){
        double amountTakenOff = loadedSandwichPrice * discount;
        double newLoadedSandwichPrice = loadedSandwichPrice - amountTakenOff;
        double amountTax = newLoadedSandwichPrice * TAX;

        return newLoadedSandwichPrice + amountTax;
    }
    public void DisplayTotal(){
        Loaded();
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
        System.out.println();
    }
}
