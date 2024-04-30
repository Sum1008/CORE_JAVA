package PrgrammingChallenges;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        System.out.println("Welcome To Swap Number Station");
        System.out.print("Enter first number : ");
        Scanner input = new Scanner(System.in);
        int n1 =input.nextInt();
        System.out.print("Enter Second number : ");
        int n2=input.nextInt();

        // int n3=n1;
        // n1=n2;
        // n2=n3;

        // n1=n1+n2;
        // n2=n1-n2;
        // n1=n1-n2;

        // n1=n1^n2;
        // n2=n1^n2;
        // n1=n1^n2;


        System.out.println("Swapping done...");
        System.out.println("Value of A is:" + n1);
        System.out.println("Value of B is:" + n2);

    }
    
}
