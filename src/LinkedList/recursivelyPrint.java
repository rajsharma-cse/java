package LinkedList;

public class recursivelyPrint {

    public static void printRec(Node temp){
        if(temp==null){
            return ;
        }
        System.out.print(temp.val+" ");
        printRec(temp.next);
    }

    public static void main(String[] args) {
        Node Head = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        // linking of Node
        Head.next = b;
        b.next = c;
        c.next = d;
        printRec(Head);
    }
}
