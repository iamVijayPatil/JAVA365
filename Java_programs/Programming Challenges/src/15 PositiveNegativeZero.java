import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number checker\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        if(num == 0){
            System.out.println("Given Number Is Zero");
        } else if (num > 0){
            System.out.println( num + " is Positive");
        }else {
            System.out.println(num + " is Negative");
        }
    }


}
