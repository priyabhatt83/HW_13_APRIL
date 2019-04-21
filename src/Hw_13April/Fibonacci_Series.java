//6.	Write a program to print Fibonacci series of n
// terms where n is input by user :
//•	1 1 2 3 5 8 13 24 .....
package Hw_13April;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=s.nextInt();
        fibonacci(n);
    }
    public static void fibonacci(int n){
        if (n == 0){
            System.out.println("0");
        }else if (n == 1) {
            System.out.println("0 1");
        }    else{
            int a = 0;
            int b = 1;
            for (int i = 1;i < n; i++){
                int nextNumber=a+b;
                System.out.print(nextNumber + "  ");
                a=b;
                b=nextNumber;

            }
        }
    }
}
