package com.company;

import java.text.NumberFormat;
import java.util.Scanner;
// Mortgage Calculator
//Written By: Michael Ippolito
//Date: 09/05/2021
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mortgage = 0;
        int principle = 0;
        float interest = 0;
        int years = 0;

        while(true) {
            System.out.print("Principle: ");
            principle = scanner.nextInt(); 
            if(principle >= 1000 && principle <= 1_000_000)
                break;
            System.out.println(("Enter a value between 1000 and 1,000,000"));
        }
        while(true) {
            System.out.print("Annual Interest Rate: ");
            interest = scanner.nextFloat();
            if(interest >= 1 && interest <= 30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }

        while(true) {
            System.out.print("Period(years): ");
            years = scanner.nextInt();
            if(years >= 1 && years <=30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }
        //monthly interest
        float r = (interest/100)/12;

        //Number of payments
        int p = years * 12;

        //calculating mortgage
        mortgage = principle * r*Math.pow(1+r, p)/(Math.pow(1 + r,p)-1);

        //Formatting mortgage
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.print("You're mortgage rate is: " + mortgageFormatted);



    }
}
