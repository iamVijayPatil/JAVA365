import java.util.Scanner;

class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to num greatest checking");

        System.out.print("Please enter first no : ");
        int N1 = input.nextInt();
        System.out.print("Please enter second no : ");
        int N2 = input.nextInt();
        System.out.print("Please enter third no : ");
        int N3 = input.nextInt();

        if (N1 > N2 && N2 > N3) {
            System.out.println(N1 + " is greatest");
        } else if (N2 > N1 && N2 > N3) {
            System.out.println(N2 + " is greatest");
        } else {
            System.out.println(N3 + " is greatest");
        }
    }
}
