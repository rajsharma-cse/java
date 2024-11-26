package PW;

public class firstAndLastPosotion {
    public static int[] function(int[] arr, int target){
        int[] ans={-1,-1};
        int n = arr.length;
        boolean flag = false;
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] == target){
                flag=true;
                break;
            } else if (arr[mid]<target) {
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        if(flag == false){
            return ans;
        }else {
            int lb=n;
            lo=0;hi=n-1;
            while (lo<=hi){
                int mid = lo +(hi-lo)/2;
                if(arr[mid]>=target){
                    lb = Math.min(lb,mid);
                    hi=mid-1;
                }else{
                    lo=mid+1;
                }
            }

            int ub=n;
            lo=0;hi=n-1;
            while (lo<=hi) {
                int mid = lo + (hi - lo) / 2;
                if (arr[mid] > target) {
                    lb = Math.min(ub, mid);
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
            ans[0]=lb;
            ans[1]=ub-1;
            return ans;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,20,20,30,60,90,100};
        int[] abc =function(arr,20);
        for(int ele : abc){
            System.out.println(ele);
        }
    }
}
