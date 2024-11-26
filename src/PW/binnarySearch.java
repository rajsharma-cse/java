package PW;

import java.util.Scanner;

public class binnarySearch {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        System.out.println("Enter number");
        int target = sc.nextInt();
        boolean flag = false;
        int lo=0;int hi=n-1;
        while(lo<=hi){
            int mid = (lo + hi)/2;
            if(arr[mid] == target){
                System.out.println(arr[mid]);
                break;
            }else if(arr[mid]<target){
                lo=mid+1;
            }else {
                hi=mid-1;
            }
        }
    }
}
