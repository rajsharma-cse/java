package PW;

public class zeroShiftArray {
    public static void main(String[] args) {
        int[] arr ={1,0,144,0,150,0,0,2,0};
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0){ // zero check karega har index par
                    // jaha zero mila apne right side se swap kr lega
                    // eg- [1,0,6] -> [1,6,0]
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        // print krne ke liye
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
