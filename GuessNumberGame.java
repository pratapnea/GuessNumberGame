package com.pratap;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class GuessNumberGame {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello, welcome to my \"Guess The Number\" game.");
        System.out.println("Please, pick a number you wanna guess between: ");

        Scanner read = new Scanner(System.in);
        //The number entered will be the maxNumber to guess between.
        int maxNum = read.nextInt();
        Random rand = new Random();
        int number = rand.nextInt(maxNum);

        //will increase the value according to the number of attempts took
        int attempt = 0, guess;
        boolean win = false;

        // loop will continue till the guess value isEqual to random value
        // i.e. till win gets true
        while (!win){

            System.out.print("Guess any number between 1 and "+ maxNum +": ");
            guess = read.nextInt();
            attempt++; //Increasing the number set in the variable attempt by 1

            if (guess == number){
                win = true; //Since the number is correct, win == true. It will break the loop.
            }

            else if(guess < number){
                System.out.println("Number is to low, tray again");
            }

            else if(guess > number){
                System.out.println("Number is to high, try again");
            }

        }

        System.out.println("Congrats, You win!!");
        System.out.println("You took total "+ attempt + " attempts.");
        sleep(10000); // To pause the CLI till 10,000 milliSeconds.

    }

}
