package Optinal_Hw;

import javax.swing.*;
import java.util.Random;

public class Number_Guessing_Game {

    public static void main(String[] args) {

        int Ans; //variable to store computer generator number

        final int MAX = 50;//variable to store maximum num up to 50

        //object to generate random number// number generate up to 50
        Random generator = new Random();

        //store computer generated random number
        Ans = generator.nextInt(MAX) + 1;

        //object to creat input Text box
        JFrame frame = new JFrame("Title");

        //variable to store the guess number
        int Guess = Integer.parseInt(JOptionPane.showInputDialog(frame, "Please enter whole number between 1 to 50 only."));

        while (Guess != Ans) //if the guess is not answer
        {
            //if Guess > 50 than error message "you need to guess between 1-50"
            if (Guess > 50) {
                System.out.println("you need to guess between 1-50.");

                //message box
                JOptionPane.showMessageDialog(frame, "you need to guess between 1-50.");
                //Input box
                Guess = Integer.parseInt(JOptionPane.showInputDialog(frame, "Please enter whole number between 1 to 50 only."));
            }
            //if Guess < 0 than error message "you need to guess between 1-50"
            if (Guess < 0) {
                System.out.println("you need to guess between 1-50.");

                //message box
                JOptionPane.showMessageDialog(frame, "you need to guess between 1-50.");
                //Input box
                Guess = Integer.parseInt(JOptionPane.showInputDialog(frame, "Please enter whole number between 1 to 50 only."));
            }
            //if guess is more than answer
            if (Guess > Ans) {
                System.out.println("You guessed to High! \nTry Again: ");

                //message box
                JOptionPane.showMessageDialog(frame, "You guessed to High! Try Again: ");
                //Input box
                Guess = Integer.parseInt(JOptionPane.showInputDialog(frame, "Please enter whole number between 1 to 50 only."));
            }
            //if guess is less than answer
            if (Guess < Ans) {
                System.out.println("You guessed to Low! \nTry Again: ");

                //message box
                JOptionPane.showMessageDialog(frame, "You guessed to Low! Try Again: ");
                //Input box
                Guess = Integer.parseInt(JOptionPane.showInputDialog(frame, "Please enter whole number between 1 to 50 only."));
            }
            //if guess is same as answer
            if (Guess == Ans) {
                System.out.println("You guessed right number.  ***HURRAY*** ");
                JOptionPane.showMessageDialog(frame, "You guessed right number. ***HURRAY*** ");

            }
        }
    }
}