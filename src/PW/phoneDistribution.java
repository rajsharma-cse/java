package PW;

public class phoneDistribution {

    public static boolean isPossiable(int[] arr,int maxq,int t){
        int store=1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]%maxq == 0){
                store += arr[i]/maxq;
            }else {
                store += arr[i]/maxq +1;
            }
        }
        if(store>t){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {15,10,10};
        int t=7;
        int n=arr.length;
        int lo=1,hi=Integer.MIN_VALUE;
        for(int i=0; i<n;i++){
            hi = Math.max(hi,arr[i]);
        }
        int maxans=0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isPossiable(arr,mid,t)){
                maxans=mid;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        System.out.println(maxans);
    }
}
