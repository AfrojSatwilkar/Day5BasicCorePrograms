package com.company1.Day5BasicCorePrograms;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        //getting input from user
        System.out.print("Enter only alphabet - ");
        Scanner scanInput = new Scanner(System.in);
        char getUserInput = scanInput.next().charAt(0);

        //condition for checking vowels
        switch (getUserInput){
            case 'a': case 'A':
            case 'e': case 'E':
            case 'i': case 'I':
            case 'o': case 'O':
            case 'u': case 'U':
                System.out.print(getUserInput+" : is a Vowel");
                break;
            default:
                System.out.print(getUserInput+" : is a Consonant");
        }
    }
}
