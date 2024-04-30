package PrgrammingChallenges;

import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter first floating Number: ");
        float n1=input.nextFloat();
        System.out.print("Enter a second floating number : ");
        float n2=input.nextFloat();

        float Multiplication=n1*n2;
        System.out.print("Multipilcation of two floating number : "+Multiplication);



    }
    
}
