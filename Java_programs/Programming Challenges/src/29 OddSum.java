import java.util.Scanner;

class OddSum {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Welcome to OddSum");
        System.out.print("Please Enter Your Number: ");
        int num = input.nextInt();
        int sum =OddSum(num);
        System.out.println("Odd sum till " + num + " is  : " + sum );

    }
    public static int OddSum(int num){
        int i=1;
        int sum=0;
        while(i<= num){
            sum+=i;
            i+=2;
        }
        return sum;
    }
}
