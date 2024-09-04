import java.util.Scanner;
class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse the Digits");
        System.out.println("Please Enter Your Number : ");
        int num = input.nextInt();
        int reverse = Reverse(num);

        System.out.println("Reverse of Your no. is : "+ reverse);
    }

    public static int Reverse(int num){
        int newNum = 0;
        while (num>0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
