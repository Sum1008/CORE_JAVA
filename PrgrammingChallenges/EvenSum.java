package PrgrammingChallenges;

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        int sum = EvenSum(num);
        System.out.println("EvenSum till " + num + " is: " + sum);
    }
    public static int EvenSum(int num){
        int sum=0;
        int i=2;
        while(i<=num){
            sum += i;
            i += 2;
        }
        return sum;

    }
    }

