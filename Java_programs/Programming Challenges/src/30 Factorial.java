import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial\n");
        System.out.print("PLease Enter Your Number : ");
        int num = input.nextInt();
        long fact = Factorial(num);
        System.out.println("Factorial of given " +num + " is :" +fact);
    }
    public static long Factorial(int num){
        long fact =1;
        int i=1;
        while(i<=num){
            fact = fact * i;
            i++;
        }
        return fact;
    }
}
