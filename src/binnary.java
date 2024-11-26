import java.util.Scanner;

public class binnary {
    public static int binary(int n){
        if(n==0||n==1){
            System.out.print(n+" ");
            return 1;
        }
        int rem =n%2;
        binary(n/2) ;
        System.out.print(rem+" ");
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        binary(n);
    }
}
