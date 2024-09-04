import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd even Calculator \n\n");
        System.out.print("Please enter your no : ");
        int num = input.nextInt();

        if (num == 1){
            System.out.println("1 is Neither prime nor odd");
        }else if (num % 2==0){
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is Odd");
        }
    }
}
