package PW;

public class array {
    public static void main(String[] args) {
        int[] arr={1,0,4,0,2,-40,100,0,5};
        int n=arr.length;
        int c=0;
        for(int ele : arr){
            if(ele == 0){
                c++;
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j] == 0){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-1-i;j++){
//                if(arr[j] == 0){
//                    int temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
