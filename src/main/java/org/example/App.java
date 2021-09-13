package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Yeshwanth Mandava
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final double TaxRate = 0.055;

        Scanner input = new Scanner(System.in);
        System.out.print("What is the order amount: ");
        double OrderTotal = input.nextDouble();
        System.out.print("What is the state: ");
        String State = input.next();
        double TAX = OrderTotal*TaxRate;

        if (State.equals("WI")){

            double Total_WI = OrderTotal+TAX;
            System.out.printf("The subtotal is $%.2f. \nThe tax is $%.2f. \nThe total is $%.2f.", OrderTotal, TAX, Total_WI);
        }

        System.out.printf("The total is $%.2f.", OrderTotal);

    }
}
