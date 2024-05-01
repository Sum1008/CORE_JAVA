package PrgrammingChallenges;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Welcome to Multiplication Table World ");
        System.out.print("Enter number you want table of : ");
        Scanner input =new Scanner(System.in);
        int num=input.nextInt();
        printMultiplicationTable(num);
    }

        public static void printMultiplicationTable(int num) {
            int i = 1;
            while (i <= 10) {
                System.out.println(num + " X " + i + " = " + (num * i));
                i++;
            }
        }
    }

