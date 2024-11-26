package PW;

public class MountainArray {
    public static int mountainArray(int[] arr){
        int n=arr.length;
        int lo=1,hi=n-2;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid]>arr[mid-1]&& arr[mid] > arr[mid+1]){
                return mid;
            } else if (arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) {
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,2,1};
        System.out.println(mountainArray(arr));
    }
}
