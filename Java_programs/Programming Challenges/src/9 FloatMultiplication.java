import java.util.Scanner;

class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome tom float multiplication \n\n");
        System.out.print("Please Enter First Decimal Number: ");
        float first = input.nextFloat();
        System.out.print("Please Enter Second Decimal Number: " );
        float second = input.nextFloat();

        float c = first*second;
        System.out.println("Product = " + c);

    }

}
