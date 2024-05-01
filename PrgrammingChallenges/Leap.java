package PrgrammingChallenges;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        System.out.println("Welcome to Leap year calculator ");
        System.out.print("Enter a year to check : ");
        Scanner input =new Scanner(System.in);

        int year=input.nextInt();
        if(year%400==0 ||(year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is an leap year .");
        }
        else{
            System.out.println(year +" is not an leap year .");
            
        }


    }
    
}
