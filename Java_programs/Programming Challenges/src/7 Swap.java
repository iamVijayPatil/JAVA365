import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swapping station\n\n");
        System.out.print("Enter Value of A: ");
        int a = input.nextInt();
        System.out.print("Enter Value of B: ");
        int b = input.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println();
        System.out.println("Swapping done...");
        System.out.println("Value of A :  " + a );
        System.out.println("Value of B :  " + b );
    }
}
