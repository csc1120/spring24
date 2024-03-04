package wk8;

public class Driver {

    public static void main(String[] args) {
        //int[] nums = {2, 3, 4, 5, 6, 7};
        int[] nums = {};
        System.out.println(binarySearch(nums, 0));
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
