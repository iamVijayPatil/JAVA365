/*Create a program to input name of the person and
        respond with ”Welcome NAME to KG Coding”*/

import java.util.Scanner;

class Welcome {
    public static void main(String[] args) {
        System.out.print("Please Enter Your Name : ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Welcome "+ name + " to KG Coding");
    }
}
