package Assignment;

import java.util.Scanner;

public class q04LengthOfString {
    public static void lenStr(String str){
        int count=0;
        for(char ch : str.toCharArray()){
            count++;
        }
        System.out.print("The length of String is : "+ count);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        lenStr(str);
    }
}
