import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum of Digits\n");
        System.out.print("PLease Enter Your Number : ");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum Of digits is : " + sum);
    }
    public static int sumOfDigits(int num){
        int sum=0;
        while(num>0){
            System.out.println(sum += num%10);
            System.out.println(num/=10);
        }
        return sum;
    }
}
