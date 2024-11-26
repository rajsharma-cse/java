package PW;

public class insertionShort {
    public static void main(String[] args) {
        int[] arr={10,-4,20,-7,-68};
        int n = arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>=1 && arr[j]<arr[j-1]){
//                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
//                }
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
