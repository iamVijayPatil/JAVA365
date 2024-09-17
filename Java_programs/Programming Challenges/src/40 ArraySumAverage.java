class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sum & Average");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        double avg = Average(numArray);
        System.out.println("Sum of elements :" + sum);
        System.out.println("Average of elements : " + avg);
    }
    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }
    public static double Average(int[] numArray) {
        double sum = sum(numArray);
    return(sum /numArray.length);
    }
}
