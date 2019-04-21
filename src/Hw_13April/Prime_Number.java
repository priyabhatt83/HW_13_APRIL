//To input any number and check if it prime number or not

package Hw_13April;

import java.util.Scanner;

public class Prime_Number {

    public static void main(String[] args) {

        int n;
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        n=sc.nextInt();

        for (int i=2;i<=n-1;i++){
             if (n%i==0){
                 temp=temp+1;
             }
        }
        if (temp==0)
        {
            System.out.println(n +" is a prime number.");
        }else{
            System.out.println(n +" is not a prime number.");

        }
    }
}
