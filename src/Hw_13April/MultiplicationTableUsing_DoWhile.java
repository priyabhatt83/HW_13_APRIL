//7. Print single multiplication table using do while loop for given number.

package Hw_13April;

import java.util.Scanner;

public class MultiplicationTableUsing_DoWhile {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=s.nextInt();
        int j = 1;

        do {
            int ans = n * j;
            System.out.println( n+ " * " +j+ " = " +ans);
            ++j;
        }
        while (j<=10);
        {
//            int ans = n * j;
//            System.out.println( n+ " * " +j+ " = " +ans);
//            ++j;

        }
    }

}
