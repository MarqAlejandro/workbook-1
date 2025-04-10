package com.plurasight;

public class Main {
    public static void main(String[] args) {

        //question 1
        int bobSalary = 50_000;
        int garySalary = 60_000;
        int highestSalary = Math.max(bobSalary, garySalary);

        if(bobSalary == highestSalary){
            System.out.println("Bob's salary is higher than Gary's\n");
        }
        else{
            System.out.println("Gary's salary is higher than Bob's\n");
        }


        //question 2
        int carPrice = 20_000;
        int truckPrice = 40_000;
        int cheaper_option = Math.min(carPrice, truckPrice);
        if(carPrice == cheaper_option){
            System.out.println("the car is the cheaper option of the 2\n");
        }
        else{
            System.out.println("the truck is the cheaper option between the 2\n");
        }

        //question 7
        double random = Math.random();
        System.out.println(random);

        //--------------------------------------------------------------------------------------------------
        //question 3
        double radius = 7.25;
        double pi = Math.PI;
        double area = pi * (Math.pow(2, radius));

        System.out.println(area);

        //question 4
        double number = 5.0;
        double square_root = Math.sqrt(number);

        System.out.println();
        System.out.println(square_root + " is the square root of " + number);

        //question 5
        int x_1 = 5;
        int y_1 = 10;

        int x_2 = 85;
        int y_2 = 50;

        int run = Math.subtractExact(x_2,x_1);

        int rise = Math.subtractExact(y_2, y_1);

        int distance = Math.divideExact(run, rise);

        System.out.println(distance);

        //question 6

        double neg_number = -3.8;

        double absolute_value = Math.abs(neg_number);

        System.out.println(number + "'s absolute value is  " + absolute_value);

    }
}
