package Assignment;

import java.util.Scanner;

public class q05Concatenate {
    public static String concat(String str1, String str2){
        return (str1+str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String : ");
        String str1=sc.nextLine();
        System.out.print("Enter 2st String : ");
        String str2=sc.nextLine();
        System.out.print("Concatenated String : "+concat(str1,str2));
    }
}
