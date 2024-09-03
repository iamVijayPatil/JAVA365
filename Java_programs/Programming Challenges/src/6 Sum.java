//Create a program to add two numbers

import java.util.Scanner;
class Sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our calculator");
        System.out.print("Please Enter first number : ");
        int firstnum = input.nextInt();
        System.out.print("Please Enter second number : ");
        int secondNum = input.nextInt();
        int c = firstnum + secondNum;

        System.out.println("Addition of " + firstnum + " & " + secondNum + " 12is:"+ c);


    }
}
