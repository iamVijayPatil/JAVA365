import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To arithmetic calculator\n\n");
        System.out.print("Please Enter First Number");
        int first = input.nextInt();
        System.out.print("Please Enter Second Number");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int mod = first % second;

        System.out.println("Addition = " + add);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " +mul);
        System.out.println("Division = " + div);
        System.out.println("Modulus =" + mod);

    }
}
