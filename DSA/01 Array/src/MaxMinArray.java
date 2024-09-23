import java.util.Scanner;

public class MaxMinArray {
        public static void main(String[] args) {
            System.out.println("Welcome to find max & min of an array");
            Scanner input = new Scanner(System.in);
            int[] numArr = inputArray();
            int max = maxArray(numArr);
            int min = MinArray(numArr);
            System.out.println("Maximum element in Array : " + max);
            System.out.println("Minimum element in Array : " + min);

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

    public static int maxArray(int[] numArr){
            if (numArr.length == 0) {
                return Integer.MIN_VALUE;
            }
            int max = numArr[0];
            int i = 1;
            while (i < numArr.length){
                if(max < numArr[i]){
                    max = numArr[i];
                }
                i++;
            }
            return max;
        }
        public static int MinArray(int[] numArray){
            int min = Integer.MAX_VALUE;
            int i = 0;
            while (i < numArray.length) {
                if (min > numArray[i]) {
                    min = numArray[i];
                }
                i++;
            }
            return min;

        }
    }

}
