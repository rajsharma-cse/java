package PW;

public class capictyShipInDays {

    public static boolean isPossible(int[] arr, int c,int d){
        int load=0,days=1;
        for(int i=0;i<arr.length;i++){
            if(load + arr[i]<=c){
                load += arr[i];
            }else{
                load=arr[i];
                days++;
            }
        }
        if(days>d){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1};
        int n = arr.length;
        int days=4;
        int lo=Integer.MIN_VALUE,hi=0;
        // lo= maxValueOfArray hi= sumOfArray
        for(int i=0;i<n;i++){
            lo=Math.max(lo,arr[i]);
            hi += arr[i];
        }
        int ans=0;
        while(lo<=hi){
            int mid = lo +(hi - lo)/2;
            // midValues = Capacity
            if(isPossible(arr,mid,days)){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        System.out.println(ans);
    }
}
