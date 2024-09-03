import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM\n");
        System.out.print("PLease Enter Your Number : ");
        int first = input.nextInt();
        System.out.print("PLease Enter Your Number : ");
        int second = input.nextInt();
        int LCM = lcmOfTwoDigits(first,second);
        System.out.println("Lcm of Two Digits is : " + LCM);
    }
    public static int lcmOfTwoDigits(int first,int second){
        int i =1;
        while(true){
            int factor = first * i;
            if (factor % second == 0){
                return factor;
            }
            i++;
        }
    }
}
