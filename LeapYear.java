package com.company1.Day5BasicCorePrograms;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {

        int year;
        //Getting year from user
        System.out.println("Enter an Year : ");
        Scanner scanInput = new Scanner(System.in);
        year = scanInput.nextInt();

        //Checking for Leap year or not
        if (year >= 1000) {
            if (((year % 4 == 0 && year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not Leap year");
            }
        }
        else{
            System.out.print("Invalid Input from User");
        }
    }
}