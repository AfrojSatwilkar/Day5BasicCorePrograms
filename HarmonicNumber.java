package com.company1.Day5BasicCorePrograms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        //Initialization variable
        double harmonicNumber = 1;

        //Getting Input from user
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Number :");
        double getUserInput = userInput.nextInt();


        if (getUserInput != 0) {
            for (double i = 2; i <= getUserInput; i++) {
                harmonicNumber = harmonicNumber + (1 / i);
            }
        }
        else {
            System.out.print("Invalid Input from User ");
            return;
        }
        System.out.print("Nth Harmonic Number is : "+String.format("%.2f",harmonicNumber));
    }
}
