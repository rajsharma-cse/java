package Assignment;
import java.util.*;
public class q01Frequency {
    public static int freq(String name,char ch) {
        int count=0;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)==ch)
            {
                count++;
            }

        }return count;
    }   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE STRING:- ");
        String name=sc.nextLine();
        System.out.print("ENTER THE CHARACTER:- ");
        char ele=sc.next().charAt(0);
        System.out.println("THE FREQUENCY OF YOUR ELEMENT IN STRING IS= "+freq(name,ele));

    }
}
