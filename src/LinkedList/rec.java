package LinkedList;

import java.util.Scanner;

public class rec {
    public static Node in(int n){
        if(n==2) return null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value ");
        int val = sc.nextInt();
        Node temp = new Node(val);
        System.out.print("do you want more (1/2) ");
        n= sc.nextInt();
        temp.next= in(n);
        return temp;
    }

    public static void main(String[] args) {
        Node root = in(1);
        Node temp = root;
        while(temp.next == null){
            System.out.print(temp.val+" -> ");
            if(temp.next==null){
                System.out.print("null");
            }
            temp=temp.next;
        }
    }
}
