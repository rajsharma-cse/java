package PW;

public class smallestDivisor {

    public static boolean isLess(int[] arr,int mid,int t){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%mid == 0){
                sum += arr[i]/mid;
            }else {
                sum += arr[i]/mid +1;
            }
        }
        if(sum<=t){
            return true;
        }
        return false;
    }

    public static int maxArray(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={37,51,50,90};
        int t=6;
        int max = maxArray(arr);
        int d=0;
        int lo=1,hi=max;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(isLess(arr,mid,t)){
                d=mid;
                hi=mid-1;
            }else {
                lo=mid+1;
            }
        }
        System.out.println(d);
    }
}
