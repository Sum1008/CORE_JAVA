package Data_Type_Variable_Input;

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Good Morning " + name);
        System.out.print(name + ", Also tell me your age:");
        int age = input.nextInt();
        System.out.print("Tell me your Blood Group:");
        char blood=input.next().charAt(0);
        System.out.println(name + " your bllod group is :" +blood);
    }
    
}
