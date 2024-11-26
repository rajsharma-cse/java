package stack;

import java.util.Scanner;

public class revString {
    public static void rev(char[] str,char[] newStr,int t){

        for(int i=str.length-1;i>=0;i--) {
            newStr[t] = str[i];
            t++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        char[] newStr = new char[20];
        int t=0;
        rev(str.toCharArray(),newStr,t);
        for(int i=0;i<=str.length()-1;i++){
            System.out.print(newStr[i]);
        }
    }
}
