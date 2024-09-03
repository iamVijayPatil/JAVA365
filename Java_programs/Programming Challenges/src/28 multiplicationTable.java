import java.util.Scanner;

class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to multiplication world\n");
        System.out.print("Please Enter Your Number : ");
        int num = input.nextInt();
        printmultiplicationTable(num);
    }
    public static void printmultiplicationTable(int num){
        int i = 1;
        while (i<=10){
            System.out.println(num + " * " + i +" = " +(num*i));
            i++;
        }
    }
}
