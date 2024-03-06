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

    public static boolean binarySearchRecursive(int[] sortedNumbers, int target) {
        return binarySearchRecursive(sortedNumbers, target, 0, sortedNumbers.length);
    }

    private static boolean binarySearchRecursive(int[] sortedNumbers, int target,
                                                 int front, int back) {
        boolean found = false;
        int middle = (front + back) / 2;
        if (back != front) {
            if (target > sortedNumbers[middle]) {
                found = binarySearchRecursive(sortedNumbers, target, middle + 1, back);
            } else if (target < sortedNumbers[middle]) {
                found = binarySearchRecursive(sortedNumbers, target, front, middle);
            } else {
                found = true;
            }
        }
        return found;
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
