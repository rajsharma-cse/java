package basic;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n =sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for (int i=0;i<n;i++){
            int next = a+b;
            System.out.print(next+" ");
            a=b;
            b=next;
        }
    }
}
