package com.company1.Day5BasicCorePrograms;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int firstNumber=0;
        int secondNumber=0;
        int temp ;

        //getting user input
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        firstNumber = userInput.nextInt();
        System.out.print("Enter Second Number : ");
        secondNumber = userInput.nextInt();

        //condition for swaping
        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        //printing user input after swaping
        System.out.println("First number after swap is - "+firstNumber);
        System.out.println("Second number after swap is - "+secondNumber);
    }
}
