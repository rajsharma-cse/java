package basic;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int fat=1;
        for(int i=2;i<=n;i++){
            fat *= i;
        }
        System.out.println("The Factorial is "+fat);
    }
}
