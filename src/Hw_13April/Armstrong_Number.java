//1: To input any number n check if its armstrong number or not

package Hw_13April;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args)
    {

    int a,arm = 0,n,temp;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    n=sc.nextInt();
    temp = n;

    for ( ;n != 0;n/=10){
        a=n%10;
        arm=arm+(a*a*a);

    }

    if (arm==temp)
    {System.out.println(temp+ "is a armstrong number.");
    }else{
        System.out.println(temp+" is a not armstrong number.");
    }


}}
