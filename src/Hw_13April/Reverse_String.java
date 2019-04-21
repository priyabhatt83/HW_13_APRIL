//3.	Write a program called Reverse String, which prompts user for a String, and prints the reverse of the String.
//        The output shall look like:
//        Enter a String: abcdef 
//        The reverse of the String "abcdef" is "fedcba".

package Hw_13April;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {

        String original , reverse = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to reverse :");
        original=in.nextLine();

        int lenght = original.length();

        for (int i = lenght-1;i>=0;i--){
            reverse = reverse + original.charAt(i);

            System.out.println("Reverse of the string is : "+reverse);
        }
    }
}
