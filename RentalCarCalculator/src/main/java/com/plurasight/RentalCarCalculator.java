package com.plurasight;
import java.util.Scanner;

public class RentalCarCalculator {

    private String pickupDate;                                      //initialize private variables
    private int userInput;
    private int  numberOfDaysRented;
    private double tollTag = 3.95;
    private double gps = 2.95;
    private double roadsideAssistance = 3.95;
    private double basicRate = 29.99;
    private double surchargeRate = 0.3;

    private int userAge;
    private double rentalTotal;
    public Scanner scanner = new Scanner(System.in);

    public void CalculatorDisplay(){                    //used to call other methods. starter method also display total at the end
        System.out.println("Welcome to Borrow-a-Bugati.");

        System.out.println("\nOpening Online Application Form.");
        InfoGather();

        System.out.println("\nOpening Add-ons and Packages.");
        CarRentalOptions();

        System.out.println("Tidying up some loose-ends. Just a moment please.");
        Surcharge();

        System.out.printf("\nTotal today is: $%.2f", rentalTotal);
        System.out.println("\n\nYour car will be ready on the pickup date: " + pickupDate +
                "\nDon't forget to pickup the car before closing time (5:00 PM)." +
                "\nThank you for your patronage, see you again soon.");


    }

    public void InfoGather(){                            //application form gather user's info
        System.out.println("Basic car rental is $29.99/day, AND THERE IS A 30% SURCHARGE FOR DRIVERS UNDER 25");
        System.out.print("\nPlease enter your age: ");
        userAge = scanner.nextInt();
        System.out.println();
        scanner.nextLine();
        System.out.print("Please input the pickup date of the car DATE FORMATTED AT DD/MM/YYYY: ");
        pickupDate = scanner.nextLine();
        System.out.print("\nPlease input the number of borrow days: ");
        numberOfDaysRented = scanner.nextInt();
        scanner.nextLine();
    }

    public void CarRentalOptions(){                     //display options, allow user to choose, and simultaneously start total
        System.out.println("\nWe offer several add-ons and packages." +
                "\n Electronic Toll Tag = $3.95/day." +
                "\n Guidance Positioning System = $2.95/day." +
                "\n Roadside Assistance Servcie = $3.95/day.");
        System.out.println("\nChoose a package or add-on:" +
                "\n-----Simple add-ons------------" +
                "\n (0) Basic Rate + Toll Tag" +
                "\n (1) Basic Rate + GPS" +
                "\n (2) Basic Rate + Roadside Assistance" +
                "\n-----Premium add-on Packages-----" +
                "\n (3) Basic Rate + Toll Tag + GPS" +
                "\n (4) Basic Rate + Toll Tag + Roadside Assistance" +
                "\n (5) Basic Rate + GPS + Roadside Assistance" +
                "\n-----Deluxe add-on Package-----" +
                "\n (6) Basic Rate + Toll Tag + GPS + Roadside Assistance" +
                "\n-----Basic Package-----" +
                "\n (7) Basic Rate only");

        userInput = scanner.nextInt();
        scanner.nextLine();

        switch(userInput) {
            case 0:
                rentalTotal = (basicRate + tollTag) * numberOfDaysRented;
                break;
            case 1:
                rentalTotal = (basicRate + gps) * numberOfDaysRented;
                break;
            case 2:
                rentalTotal = (basicRate + roadsideAssistance) * numberOfDaysRented;
                break;
            case 3:
                rentalTotal = (basicRate + tollTag + gps) * numberOfDaysRented;
                break;
            case 4:
                rentalTotal = (basicRate + tollTag + roadsideAssistance) * numberOfDaysRented;
                break;
            case 5:
                rentalTotal = (basicRate + gps + roadsideAssistance) * numberOfDaysRented;
                break;
            case 6:
                rentalTotal = (basicRate + tollTag + gps + roadsideAssistance) * numberOfDaysRented;
                break;
            default:
                rentalTotal = basicRate * numberOfDaysRented;
        }//end of switch statement

    }// end of CarRentalTotal method
    public void Surcharge(){                    //only will trigger if user is less than or equal to 25 years old.
        double temp;
        if(userAge <= 25){
            System.out.println("\n*****WARNING!!! Under 25 Y/0 Driver detected. Applying surcharge.*****");
            temp = rentalTotal * surchargeRate;
            rentalTotal += temp;
        }
    }
}