package Assignment;

import java.util.Scanner;

public class q07RemoveCharacters {
    public static void alphabets(String str, int idx)
    {   String newstr="";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                newstr += ch;
            }
        }
        System.out.print(newstr);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE STRING : ");
        String str=sc.nextLine();
        alphabets(str, 0);
    }
}
