//4.	WAP to input any five digit number and then find sum of each digit

package Hw_13April;

import java.util.Scanner;
public class Sum_Of_FiveNumbers {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int input = in.nextInt();
        int sum = 0;

        while (input > 0)
        {
            int add = input % 10;
            sum = sum + add;
            input = input / 10;

        }
        System.out.println(sum);

    }
}
