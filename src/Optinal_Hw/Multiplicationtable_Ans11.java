//11.	 Print multiple multiplication tables using for loop for given number like

package Optinal_Hw;

import java.util.Scanner;

public class Multiplicationtable_Ans11 {


    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int num = s.nextInt();
        int temp = num;

        for(int i =1;i<=10; ++i){
             num = temp;
            //declared temp as num coz we want num start with 1 everytime when it come out from inner loop


        for ( int j = 1; j <= 7; ++j) {

            int ans = num * i;
            System.out.format("%-15s",num + " * " + i + " = " + ans);//value of num is 7
            ++num;
            //here after finishing loop 4 times the value of num will be 8
        }
        System.out.println();
        }
    }
}