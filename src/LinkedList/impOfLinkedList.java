package LinkedList;

import java.util.Scanner;

//class Node {
//    int val;
//    Node next;
//
//    Node(int val) {
//        this.val = val;
//    }
//}
class SLL{
    Node Head;
    Node Tail;
    int size;
    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(Head == null){
            Head = Tail = temp;
        }else{
            Tail.next = temp;
            Tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        Node temp=new Node(val);
        if(Head == null){
            Head = Tail = temp;
        }else{
            temp.next=Head;
            Head = temp;
        }
        size++;
    }
    void insert(int idx,int val){
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtEnd(val);
            return;
        }
        if(idx>size){
            System.out.println("INVALID INDEX!");
        }
        Node temp = new Node(val);
        Node x = Head;
        for(int i=1;i<idx;i++){
            System.out.println(i);
            x = x.next;
        }
        temp.next=x.next;
        x.next=temp;
        size++;
    }
    int get(int idx) throws Error{
        if(idx==size-1){
            return Tail.val;
        }
        if(idx>=size || idx<0){
            throw new Error("BHAI INDEX SAHI SE DALO");
        }
        Node temp = Head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void set(int idx,int val) throws Error{
        if(idx==size-1){
            Tail.val=val;
        }
        if(idx>=size || idx<0){
            throw new Error("BHAI INDEX SAHI SE DALO");
        }
        Node temp = Head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        temp.val = val;
    }
    void display(){
        Node temp = Head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println(size);
    }
}

public class impOfLinkedList {

    public static void main(String[] args) {
        SLL ll = new SLL();
        Scanner sc = new Scanner(System.in);
        int ch ;
        char ans='y';
        while(ans=='y'){
            System.out.println("1.InsertAtEnd \n2.Insert\n3.Display\n4.exit");
            ch=sc.nextInt();
            switch (ch){
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    ll.insertAtEnd(val);
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    int vl = sc.nextInt();
                    System.out.print("Enter Index: ");
                    int idx = sc.nextInt();
                    ll.insert(idx,vl);
                    break;
                case 3:
                    ll.display();
                    break;
                case 4:
                    ans='n';
            }
        }
    }
}
