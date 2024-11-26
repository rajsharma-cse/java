package PW;

import java.util.Scanner;

public class ques01 {
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void print(int[] arr){
        for( int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[10];
        System.out.println("Eneter the element : ");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<10;i++){
            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
//        print(arr);
        System.out.println(arr[arr.length/2]);
    }
}
