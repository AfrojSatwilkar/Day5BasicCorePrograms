package com.company1.Day5BasicCorePrograms;
import java.util.Scanner;
public class PrimeFactors {
    public static void main(String[] args) {
        //Getting user input
        System.out.println("Enter Number : ");
        Scanner scanInput = new Scanner(System.in);
        int getUserInput = scanInput.nextInt();

        //finding prime factors
        if (getUserInput>=2) {
            for (int i = 2; i<=getUserInput; i++) {
                for (int j = 1; getUserInput % i == 0; j++) {
                    System.out.println(i);
                    getUserInput = getUserInput / i;
                }
            }
        }
        else{
            System.out.print("Invalid User Input");
        }
    }
}
