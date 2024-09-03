import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime World\n");
        System.out.print("PLease Enter Your Number : ");
        int num = input.nextInt();
        boolean isprime = isprime(num);
        if (isprime) {
            System.out.println(num + " is a prime no");
        } else {
            System.out.println(num + " is not a prime no");
        }
    }
    public static boolean isprime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}


