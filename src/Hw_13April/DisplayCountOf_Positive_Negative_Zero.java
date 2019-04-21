//10.	Write a program to enter the numbers till the user wants
// and at the end it should display the count of positive,
// negative and zeros entered.

package Hw_13April;

import java.util.Scanner;

public class DisplayCountOf_Positive_Negative_Zero {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number;
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        char choise;

        do {
            System.out.println("Enter the number ");
            number = console.nextInt();

            if (number > 0)
            {
                countPositive++;
            }
            else if (number < 0)
            {
                countNegative++;
            }
            else
            {
                countZero++;
            }
            System.out.print(" Do you Want to continue y/n? ");
            choise = console.next().charAt(0);
        }
        while ( (choise == 'y' || choise =='Y'));

        System.out.println("Positive Number: " + countPositive);
        System.out.println("Negative Number: " + countNegative);
        System.out.println("Zero Number: " + countZero);







    }
}
