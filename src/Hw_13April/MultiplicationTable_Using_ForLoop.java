//8.	Print single multiplication table using for loop for given number as per question 7.

package Hw_13April;

import java.util.Scanner;

public class MultiplicationTable_Using_ForLoop {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=s.nextInt();

        for (int j = 1;j<=10;++j)
        {
            int ans = n * j;
            System.out.println( n+ " * " +j+ " = " +ans);


        }
    }

}
