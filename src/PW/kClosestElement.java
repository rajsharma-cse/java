package PW;

public class kClosestElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        int lo=0,hi=n-1;
        int lb=n;
        int target=5;
        while(lo<=hi){
            int mid=lo + (hi-lo)/2;
            if(arr[mid] >= target){
                lb=Math.min(lb,mid);
                hi = mid-1;
            }else {
                lo = mid+1;
            }
        }
        System.out.println(lb);
    }
}