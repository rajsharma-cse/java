package basic;

import java.util.Scanner;

public class factorialRecursion {
    public static int fat(int n){
        if(n==0 || n==1) return 1;
        return n*fat(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("The Factorial is "+fat(n));
    }
}
