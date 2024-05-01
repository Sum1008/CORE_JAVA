package PrgrammingChallenges;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {

        System.out.println("Welcome to Grade System .");
        System.out.print("Enter a percentage you got : ");
        Scanner input=new Scanner(System.in);
        float percentage=input.nextFloat();

        if(percentage>=95){
            System.out.println("Congrats ! You got A+ Grade .");
        }
        else if(percentage==90){
            System.out.println("Congrats ! You got A+ Grade .");
        }
        else if(percentage>=80 &&percentage<90){
            System.out.println("Congrats ! You got A Grade .");
        }
        else if(percentage>=70&& percentage<80){
            System.out.println("Congrats ! You got B+ Grade ,Keep working ");
        }
        else if(percentage>=60 &&percentage<70){
            System.out.println("Good! You got B Grade . Need to study to upskill. ");
        }
        else if(percentage>=50&&percentage<60){
            System.out.println("Congrats ! You got C Grade .Keep focus on study");
        }
        else if(percentage>=35 && percentage<50){
            System.out.println("Congrats ! You got D Grade .You seriously need to work harde");
        }
        else{
            System.out.println("Sorry ,you failed the exam ,but dont give up Keep learning .");
        }

    
    }
    
}
