package LinkedList;

public class middleElement {
    public static void main(String[] args) {
        Node Head = new Node(10);
        Node b = new Node(10);
        Node c = new Node(20);
        Node d = new Node(30);
        Node e = new Node(40);
        Node f = new Node(50);
        Node g = new Node(60);
        Head.next=b;
        b.next=c;
        c.next=d;
        d.next=f;
        f.next=g;
        int len=0;
        Node temp = Head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        System.out.println(len);
        int mid = (len)/2;
        temp=Head;
        for(int i=1;i<=mid;i++){
            temp=temp.next;
        }
        System.out.println(temp.val);
    }
}
