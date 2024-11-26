package atif;

public class fabo {
    public static int binary(int lo,int hi,int ele,int[] arr){
        if(lo>hi) return -1;
        int mid = lo + (hi-lo)/2;
        if(arr[mid] == ele){
            return mid;
        } else if (arr[mid]<ele) {
            return binary(mid+1,hi,ele,arr);
        }else{
            return binary(lo,mid-1,ele,arr);
        }

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(binary(0,arr.length-1,1,arr));
    }
}
