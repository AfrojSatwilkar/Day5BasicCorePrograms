package com.company1.Day5BasicCorePrograms;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        int quotient;
        int remainder;
        //Getting user input for Dividend
        System.out.print("Enter Dividend number : ");
        Scanner scanInput = new Scanner(System.in);
        int getUserInputDividend = scanInput.nextInt();

        //getting user input for Divisor
        System.out.print("Enter Divisor number : ");
        int getUserInputDivisor = scanInput.nextInt();

        //calculating Quotient
        quotient =getUserInputDividend/getUserInputDivisor;
        System.out.println("Quotient is - "+quotient);

        //calculating Remainder
        remainder =getUserInputDividend%getUserInputDivisor;
        System.out.println("Remainder is - "+remainder);
    }
}
