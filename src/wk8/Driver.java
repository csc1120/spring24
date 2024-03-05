package wk8;

public class Driver {

    public static void main(String[] args) {
        System.out.println(factorial(20));
    }

    private static long factorial(int i) {
        long result = i;
        if (i > 1) {
            result *= factorial(i - 1);
        }
        return result;
    }

    public static boolean binarySearch(int[] sortedNumbers, int target) {
       boolean found = false;
       int front = 0;
       int back = sortedNumbers.length;
       while (!found && (back - front) > 0) {
           int middle = (back + front) / 2;
           if (target > sortedNumbers[middle]) {
               front = middle + 1;
           } else if (target < sortedNumbers[middle]) {
               back = middle;
           } else {
               found = true;
           }
       }
       return found;
    }
}
