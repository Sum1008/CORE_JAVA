package PrgrammingChallenges;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        System.out.println("Welcome to Even odd checker ");
        System.out.print("Enter a number which you want to check : ");
        Scanner input =new Scanner(System.in);
        int num=input.nextInt();

        if(num%2==0){
            System.out.println(num + " is even number .");

        }
        else{
            System.out.println(num + " is odd number .");
        }

    }
    
}
