package LinkedList;

public class revLinkedList {
    public static void main(String[] args) {
        Node Head = new Node(10);
        Node b = new Node(15);
        Node c = new Node(20);
        Node d = new Node(25);
        Node e = new Node(30);
        Node f = new Node(45);
        Node g = new Node(50);
        Node h = new Node(60);
        Node i = new Node(251);
        Head.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;

        Node temp = Head;
        Node HeadEven = null;
        Node HeadOdd = null;
        while(HeadEven ==null || HeadOdd ==null){
            if(temp.val % 2 == 0){
                HeadEven = temp;
            }else{
                HeadOdd = temp;
            }
            temp=temp.next;
        }
//        System.out.println(HeadEven.val);
//        System.out.println(HeadOdd.val);
        Node tempE=HeadEven;
        Node tempO =HeadOdd;
        temp =Head;
        while(temp!=null){
            if(temp == HeadEven || temp == HeadOdd){
                temp = temp.next;
                continue;
            }else{
                if(temp.val % 2 == 0){
                    tempE.next = temp;
                    tempE = temp;
                }else{
                    tempO.next = temp;
                    tempO=temp;
                }
                temp=temp.next;
            }
        }
        tempE.next=null;
        tempO.next=null;
        Node temp1=HeadOdd;
        Node temp2=HeadEven;
        while(temp1!=null){
            System.out.print(temp1.val+"->");
            temp1=temp1.next;
        }
        System.out.println();
        while(temp2!=null){
            System.out.print(temp2.val+"->");
            temp2=temp2.next;
        }

    }
}
