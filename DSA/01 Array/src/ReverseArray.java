//Array reversal

import java.util.Scanner;

public class ReverseArray {
        public static void main(String[] args) {
            System.out.println("Welcome to array Reversing\n");
            int[] numArr = inputArray();
            reverse(numArr);
            System.out.println("Reverse of ur Array : ");
            displayArray(numArr);
        }

        public static int[] inputArray() {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter the no of elements : ");
            int size = input.nextInt();
            int[] nums = new int[size];
            int i = 0;
            while (i < size) {
                System.out.print("Please enter element no " + (i + 1) + " : ");
                nums[i] = input.nextInt();
                i++;
            }
            return nums;
        }

        public static void displayArray(int[] numArray) {
            int i = 0;
            while (i < numArray.length) {
                System.out.print(numArray[i]);
                i++;
            }
            System.out.print(" ");
        }

        public static void reverse(int arr[]) {
            int i = 0;
            while (i < arr.length / 2) {
                int swap = arr[i];
                arr[i] = arr[(arr.length - 1) - i];
                arr[(arr.length - 1) - i] = swap;
                i++;
            }
        }
}


