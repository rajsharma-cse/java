package Assignment;
import java.util.Scanner;
public class q02Count {
    public static void count(String name) {
        name = name.toLowerCase();
        int num=0,cons=0,vowels=0,wspace=0;
        for(int i=0;i<name.length();i++)
        {   char curr=name.charAt(i);
            if(curr>=48&&curr<=57 ) {
                num++;
            }else if(curr=='a'||curr=='e'||curr=='i'||curr=='o'||curr=='u'){
                vowels++;
            } else if (curr == ' ') {
                wspace++;
            }else {
                cons++;
            }
        }
        System.out.println("Vowels= "+vowels+" consonants= "+cons+" numbers= "+num+" White Space= "+wspace);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:- ");
        String ele=sc.nextLine();
        count(ele);
    }
}
