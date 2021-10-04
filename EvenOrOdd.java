package com.company1.Day5BasicCorePrograms;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        //getting input from user
        System.out.print("Enter number - ");
        Scanner scanInput = new Scanner(System.in);
        int getUserInput = scanInput.nextInt();

        //checking condition for even or odd
        if (getUserInput%2==0){
            System.out.print(getUserInput+" : Even number");
        }
        else{
            System.out.print(getUserInput+" : Odd number");
        }
    }
}
