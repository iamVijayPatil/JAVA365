import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Armstrong No checking");
        System.out.print("Please Enter the number : ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong){
            System.out.println(num +" is an armstrong NO");
        }else{
            System.out.println(num +" is not an armstrong NO");
        }


    }public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num);
        System.out.println("no of digits : "+ noOfDigits);
        int finalNumber =0;
        int numCopy = num;
        while (num > 0){
            int lastDigit = num % 10;
            num /=10;
            finalNumber += Power(lastDigit ,noOfDigits );

        }
        System.out.println("Final no = "+ finalNumber);
        return finalNumber == numCopy;

    }public static int Power(int num1 , int num2){
        int result = num1;
        int i = 1;
        while(i < num2){
            result *= num1;
            i++;
        }
        System.out.println("power of "+ num1 + "is :" +result);
        return result;
    }


    public static int noOfDigits(int num){
        int digits = 0;
        while(num > 0){
            digits++;
            num /= 10;
        }
        return digits;
    }
}
