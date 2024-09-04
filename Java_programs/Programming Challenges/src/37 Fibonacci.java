import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Fibonacci series");
        System.out.print("Please Enter the number up to which series has to be printed : ");
        int num = input.nextInt();
        System.out.println("Here is the Fibonacci series");
        printFibonacci(num);


    }public static void printFibonacci(int num){
        if (num<0) return;
        System.out.print("0 ");
        if (num==0)return;
        System.out.print("1 ");

        int first = 0 , second = 1;
        while(first + second <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second ;
            second = third;
        }
    }

}
