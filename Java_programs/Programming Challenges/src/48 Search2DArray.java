import java.util.Scanner;

class Search2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to 2D search \n");
        Scanner input = new Scanner(System.in);
        int[][] numArr = ArrayUtility.input2DArray();
        System.out.println("Now , enter the no you want to search : ");
        int num = input.nextInt();
        boolean isfound =
        if (isfound) {
            System.out.println("Ur number was found ");
        } else {
            System.out.println("Ur number was found ");
        }
        public static boolean search(int[][] numArray , int number){
            int i = 0;
            while (i < numArray.length) {
                int j = 0;
                while (j < numArray[i].length) ;
                if (numArray[i] == number) {
                    return true;
                }
                j++;
            }
            i++;
            return false;
        }
    }
}
