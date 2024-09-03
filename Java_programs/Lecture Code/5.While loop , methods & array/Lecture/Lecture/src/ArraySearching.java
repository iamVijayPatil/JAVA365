import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3, 6, 8, 87, 65, 4, 23, 9, 98, 34};
        System.out.println("Welcome to array seaching\n");
        System.out.println("Enter the number you want to search : ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println("Your no was found in array");
        } else {
            System.out.println("Your no was not found in the array ");
        }
    }

    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;

        /*String[] strArr = new String[4];
        strArr[0] = "My String";

        String[] newStrArr = {"First" , "Second"  ,"Third"};
        System.out.println(newStrArr.length);*/


    }
}

