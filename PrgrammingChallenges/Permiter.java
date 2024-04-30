package PrgrammingChallenges;

import java.util.Scanner;

public class Permiter {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome ! To the permiter Calculator");
        System.out.print("Enter first side in cms : ");
        double a=input.nextDouble();
        System.out.print("Enter second side in cms : ");
        double b=input.nextDouble();
        System.out.print("Enter third side in cms : ");
        double c=input.nextDouble();
        System.out.print("Enter fourth side in cms : ");
        double d=input.nextDouble();

        double perimeter =a+b+c+d;
        System.out.print("Perimeter of your rectangle is: " + perimeter + "cm");



    }
    
}
