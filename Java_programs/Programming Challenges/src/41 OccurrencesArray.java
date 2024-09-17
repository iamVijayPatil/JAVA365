import java.util.Scanner;

class OccurrencesArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Occurrences");
        Scanner input = new Scanner(System.in);
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Please Enter the number you want to find :");
        int num = input.nextInt();
        int occurrences = noOfOccurrences(numArray , num);
        System.out.println("Ur element was found " + occurrences + "times in array");
    }
    public static int noOfOccurrences(int[] numArray, int num){
        int occ = 0;
        int i = 0;
        while (i < numArray.length){
            if(numArray[i] == num) {
                occ++;
            }
        }
        return occ;
    }
}
