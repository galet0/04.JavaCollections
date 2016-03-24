import java.util.HashMap;
import java.util.Scanner;


public class _11_ImplementRecursiveBinarySearch {
    public static final int NOT_FOUND = -1;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int searchedElement = scn.nextInt();
        String[] inputLine = scn.next().split(" ");
        int[] numbers = new int[inputLine.length];
        int index = binarySearch(numbers,searchedElement);
        System.out.println(index);
    }

    public static int binarySearch(int[] a, int target) {
        return binarySearch(a, 0, a.length-1, target);
    }

    public static int binarySearch(int[] a, int start, int end, int target) {
        int middle = (start + end) / 2;
        if(end < start) {
            return -1;
        }

        if(target==a[middle]) {
            return middle;
        } else if(target<a[middle]) {
            return binarySearch(a, start, middle - 1, target);
        } else {
            return binarySearch(a, middle + 1, end, target);
        }
    }
}
