package basicShorting;

import java.util.Scanner;

public class selectionSort {
    public static void selectionSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Sample array
        int[] arr = {64, 25, 12, 22, 11};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose sorting order:");
        System.out.println("1. Ascending Order");
        System.out.println("2. Descending Order");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        System.out.println("Original Array:");
        printArray(arr);

        if (choice == 1) {
            selectionSortAscending(arr);
            System.out.println("Sorted Array in Ascending Order:");
        } else if (choice == 2) {
            selectionSortDescending(arr);
            System.out.println("Sorted Array in Descending Order:");
        } else {
            System.out.println("Invalid choice!");
            scanner.close();
            return;
        }

        printArray(arr);

        scanner.close();
    }
}

