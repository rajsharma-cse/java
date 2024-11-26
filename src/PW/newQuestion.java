package PW;

public class newQuestion {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {78,97,86,75,42,51,10};
        int x=0;
        for(int i=0;i<arr.length;i++){
            int min=Integer.MAX_VALUE;
            int mindx=1;
            for(int j=0;j<arr.length;j++){
                if(arr[j]<min && arr[j]>0) {
                    min = arr[j];
                    mindx = j;
                }
            }
            arr[mindx]=x;
            x--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] *= -1;
        }
        print(arr);
    }
}
