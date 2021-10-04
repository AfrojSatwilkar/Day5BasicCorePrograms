package com.company1.Day5BasicCorePrograms;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        //initializing variable
        int firstNumber;
        int seconNumber;
        int thirdNumber;

        //getting user input
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        firstNumber= userInput.nextInt();
        System.out.print("Enter 2nd Number : ");
        seconNumber=userInput.nextInt();
        System.out.print("Enter 3rd Number : ");
        thirdNumber=userInput.nextInt();

        //checking for greater condition
        if(firstNumber>seconNumber && firstNumber>thirdNumber) {
            System.out.println(firstNumber+" : is greater among 3 numbers");
        }else if(seconNumber>firstNumber && seconNumber>thirdNumber) {
            System.out.println(seconNumber+" : is greater among 3 numbers");
        }else if(thirdNumber>firstNumber && thirdNumber>seconNumber){
            System.out.println(thirdNumber+" : is greater among 3 numbers");
        }
        else if(firstNumber==seconNumber || firstNumber==thirdNumber || seconNumber==thirdNumber){
            System.out.println("you enter 2 similer number");
        }
    }
}
