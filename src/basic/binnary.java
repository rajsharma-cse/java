package basic;

import java.util.Scanner;

public class binnary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int lo=0,hi=arr.length-1,mid=0;
        System.out.print("Eneter element: ");
        int ele = sc.nextInt();
        boolean flag = false;
        while(lo<=hi){
            mid = lo + (hi-lo)/2;
            if(arr[mid]==ele){
                flag = true;
                break;
            } else if (arr[mid]<ele) {
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        if(flag) System.out.println("Element found on index "+mid);
        else System.out.println("Element not found ");
    }
}
