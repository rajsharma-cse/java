package Assignment;

import java.util.Scanner;

public class q08LexicographicalOder {
    public static void lexi(String[] arr){
        int n= arr.length;
        for(int i = 0; i < n-1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(String a : arr){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        System.out.print("Enter the element : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
        lexi(arr);
    }
}
