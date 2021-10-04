package com.company1.Day5BasicCorePrograms;

public class PowerOfTwo {
    public static void main(String[] args) {
        int i =0;
        int powerOfTwo = 1;
        int userInput = Integer.parseInt(args[0]);

        if(i<=userInput && userInput<31){
            for(int j=1;j<=userInput;j++){
                powerOfTwo = 2 * powerOfTwo;
            }
        }
        else{
            System.out.println("Invalid User Input");
            return;
        }
        System.out.println(userInput+" power of two is "+powerOfTwo);
    }
}
