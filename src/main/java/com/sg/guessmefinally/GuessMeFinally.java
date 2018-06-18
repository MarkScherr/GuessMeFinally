/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.guessmefinally;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mrsch
 */
public class GuessMeFinally {
    public static void main(String[] args) {
        int randomNumber, numberGuessed;
        
        Scanner in = new Scanner(System.in);
        
        Random rdm = new Random();
        randomNumber = rdm.nextInt(100)+1;
        
        System.out.println("Guess a number between 1 and 100?");
        numberGuessed = in.nextInt();
        
        if (numberGuessed == randomNumber) {
            System.out.println("I can't believe you guessed it on your first try! You're a Jedi!");
        } else {
            do {
                if (numberGuessed > randomNumber) {
                    System.out.println("Your number was much higher than the real number, Guess Again.");
                    numberGuessed = in.nextInt();
                } 
                
                if (numberGuessed < randomNumber) {
                    System.out.println("Your number was much lower than the real number, Guess Again");
                    numberGuessed = in.nextInt();
                } 
                if (numberGuessed == randomNumber) {
                    System.out.println("You finally got the right number, I am about "
                            + "5 years older, but you are finally correct!");
                }
            } while(randomNumber != numberGuessed);
        }
    }
}
