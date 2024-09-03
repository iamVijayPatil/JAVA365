import java.util.Scanner;

class GCD {
    public static void main(String[]args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to LCM\n");
            System.out.print("PLease Enter Your Number : ");
            int first = input.nextInt();
            System.out.print("PLease Enter Your Number : ");
            int second = input.nextInt();
            int Gcd = gcdOfTwoDigits(first, second);
            System.out.println("Lcm of Two Digits is : " + Gcd);
        }
        public static int gcdOfTwoDigits (int num1,int num2){
            int gcd =1;
            int i = 2;
            int least = least(num1,num2);
            while (i<=least){
                if (num1 % i ==0 && num2 % i == 0){
                    gcd = i ;
                }
                i++;
            }
            return gcd;
        }
        public static int least (int num1,int num2){
            if(num1<num2){
                return num1;
            }else{
                return num2;
            }
        }
    }

