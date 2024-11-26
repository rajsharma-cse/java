package Assignment;

import java.util.Scanner;

public class q03ReveseStringRecur {
    public static void rev(String str,int idx) {
        if(idx>=0) {
            System.err.print(str.charAt(idx));
            rev(str,idx-1);
        }
    }

    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE STRING TO REVERSE IT: ");
        String str=sc.nextLine();
        System.out.print("REVERSE STRING IS: ");
        rev(str,str.length()-1);
    }
}
