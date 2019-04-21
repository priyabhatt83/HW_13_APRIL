//9.	Input number & reverse it & print it using while loop.
package Hw_13April;

import java.util.Scanner;

public class Reverse_Number {

    public static void main(String[] args) {
        int num = 0;
        int reversenum = 0;
        System.out.println("Input your number and press enter : ");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  numbers :");
        num =in.nextInt();
        while (num != 0){

            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num/10;

        }
        System.out.println("Reverse of input number is : "+reversenum);
    }
}
