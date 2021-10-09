package com.company1.Day5BasicCorePrograms;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {

        //Initilazing variables
        double flipCoin;
        double countHead =0;
        double counttail =0;

        //Getting user Input for number of times
        System.out.print("Enter the Number of times you want to flip the coin : ");
        Scanner scanInput = new Scanner(System.in);
        int userInput = scanInput.nextInt();

        //Checking for Head and Tail Count
        for (int i=0; i<userInput; i++){
            Random num = new Random();
            flipCoin = num.nextInt(2);
            if (flipCoin == 1.0){
                countHead++;
            }
            else {
                counttail++;
            }
        }

        //Percentage of Head and tail
        System.out.println("Head repeats "+countHead+" times");
        System.out.println("Tail repeats "+counttail+" times");
        double percentageHead = (countHead/userInput)*100.0f;
        System.out.println("Percentage of Head :"+percentageHead+"%");
        double percentageTail = (counttail/userInput)*100.0f;
        System.out.println("Percentage of Tail :"+percentageTail+"%");
    }
}
