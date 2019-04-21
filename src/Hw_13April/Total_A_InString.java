//5.	WAP to enter any String and count total number of 'a' in that String
package Hw_13April;

import java.util.Scanner;

public class Total_A_InString {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter a sentence :");
        Scanner sc = new Scanner(System.in);

        String sentence =sc.nextLine();

        for (int i = 0; i<sentence.length();i++){
            char ch = sentence.charAt(i);
            if ( ch =='a'){
                count++;

            }
        }
        System.out.println("Number of 'a' in given sentence is " +count);
    }
}
