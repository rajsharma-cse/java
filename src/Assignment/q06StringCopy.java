package Assignment;

import java.util.Scanner;

public class q06StringCopy {
    public static String copi(String str,int idx,String newstr){
        if(idx<str.length()) {
            newstr+=str.charAt(idx);
            return copi(str, idx+1, newstr);
        }
        return newstr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE STRING : ");
        String str=sc.nextLine();
        String newstr="";
        String copied=copi(str,0,newstr);
        System.out.println("YOUR COPIED STRING IS : "+copied);
    }
}
