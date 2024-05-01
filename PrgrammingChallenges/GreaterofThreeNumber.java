package PrgrammingChallenges;

import java.util.Scanner;


public class GreaterofThreeNumber {
    public static void main(String[] args) {
        System.out.println("Welcome To World of Three ");
        System.out.print("Enter a First number : ");
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        System.out.print("Enter a Second number : ");
        int num2=input.nextInt();
        System.out.print("Enter a Third number : ");
        int num3=input.nextInt();

        if(num1>=num2 && num1>=num3){
            System.out.println("First number is greater ");
        }
        else if(num2>=num3 && num2>=num1){
            System.out.println("Second number is greater ");

        }
        else{
            System.out.println("Third number is greater ");
        }



    }
    
}
