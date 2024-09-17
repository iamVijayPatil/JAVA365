class PalindromeArray {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        boolean isPalin = isPalin(numArr);
        if (isPalin){
            System.out.println("Array is palindome");
        }else{
            System.out.println("Array is Not palindome");
        }
    }

    public static boolean isPalin(int[] numArr){
        int i = 0;
        while (i < numArr.length / 2){
            if (numArr[i] != numArr[numArr.length - 1 - i]) {
                return false ;
            }i++;
        }
        return true;
    }
}
