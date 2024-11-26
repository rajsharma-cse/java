package atif;

public class rec {

    public static int binary(int lo, int hi, int ele, int[] arr) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (arr[mid] == ele) {
            return mid; // Element found
        } else if (arr[mid] < ele) {
            return binary(mid + 1, hi, ele, arr); // Search in the right half
        } else {
            return binary(lo, mid - 1, ele, arr); // Search in the left half
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int elementToFind = 1; // Change this to test different values
        int result = binary(0, arr.length - 1, elementToFind, arr);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
