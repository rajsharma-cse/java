package LinkedList;

import java.util.Scanner;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class list{
    Node Head;
    Node Tail;
    boolean isEmpty(){
        if(Head == null && Tail == null){
            return true;
        }
        return false;
    }
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(Head==null && Tail==null){
            Head = Tail = temp;
        }
        else{
            Tail.next=temp;
            Tail=temp;
        }
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(Head==null && Tail==null){
            Head = Tail = temp;
        }
        else{
            temp.next=Head;
            Head=temp;
        }
    }
    void insertAtIndex(int val, int idx){
        Node temp = new Node(val);
        if(Head==null && Tail==null){
            Head = Tail = temp;
        }
        else{
            Node temp1 = Head;
            for(int i=1;i<=idx-1;i++){
                temp1=temp1.next;
            }
            temp.next = temp1.next;
            temp1.next=temp;
        }
    }
    void deleteAtTail(){
        if(isEmpty()){
            System.out.println("Underflow Linkedlist !");
            return;
        }
        Node temp = Head;
        while(temp.next != Tail){
            temp=temp.next;
        }
        temp.next=null;
        Tail=temp;
    }
    void deleteAtHead(){
        if(isEmpty()){
            System.out.println("Underflow Linkedlist !");
            return;
        }
        Head=Head.next;
    }
    void deleteAtIndex(int idx){
        if(isEmpty()){
            System.out.println("Underflow Linkedlist !");
            return;
        }
        Node temp = Head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    void display(){
        Node temp = Head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println ();
    }
}

public class linkedList{
    public static void main(String[] args){
        list ll = new list();
        Scanner sc = new Scanner(System.in);
        char a = 'y';
        while(a == 'y'){
            System.out.println();
            System.out.println("------------->LinkedList Program<-------------");
            System.out.println("Select your choice\n1.Insert\n2.Delete\n3.display\n4.exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println();
                    System.out.println("1.Insert At Head\n2.Insert At Tail\n3.Insert at index");
                    System.out.println("Enter your choice:");
                    int x=sc.nextInt();
                    switch (x) {
                        case 1:
                            System.out.print("Enter value: ");
                            int val = sc.nextInt();
                            ll.insertAtHead(val);
                            break;
                        case 2:
                            System.out.print("Enter value: ");
                            int val1 = sc.nextInt();
                            ll.insertAtTail(val1);
                            break;
                        case 3:
                            System.out.print("Enter value: ");
                            int val2 = sc.nextInt();
                            System.out.println("Enter index: ");
                            int idx= sc.nextInt();
                            ll.insertAtIndex(val2, x);;
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("1.Delete At Head\n2.Delete At Tail\n3.Delete at index");
                    System.out.println("Enter your choice:");
                    int y=sc.nextInt();
                    switch (y) {
                        case 1:
                            ll.deleteAtHead();
                            break;
                        case 2:
                            ll.deleteAtTail();
                            break;
                        case 3:
                            System.out.println("Enter the index: ");
                            int idx1 = sc.nextInt();
                            ll.deleteAtIndex(idx1);
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    ll.display();
                    break;
                case 4:
                    a='n';
                    break;
                default:
                    System.out.println("Invailed choice !");
            }
        }
    }

}