package doubleLinkedList;
class DNode{
    int val;
    DNode next;
    DNode pev;
    DNode(int val){
        this.val=val;
    }
}
class funDlist{
    DNode Head;
    DNode Tail;

    void insertAtTail(int val){
        DNode temp = new DNode(val);
        if(Head == null) Head=Tail=temp;
        else{
            Tail.next=temp;
            temp.pev=Tail;
            Tail=temp;
        }
    }
    void insertAtHead(int val){
        DNode temp = new DNode(val);
        if(Head == null) Head = Tail =temp;
        else{
            temp.next=Head;
            Head=temp;
        }
    }
    void insertAtIndex(int val,int index){
        DNode temp = new DNode(val);
        if(Head==null){
            Head = Tail =temp;
        }else {
            DNode x = Head;
            for(int i=1;i<=index-1;i++){
                x=x.next;
            }
            DNode y= x.next;
            x.next= temp; y.pev =temp;
            temp.pev=x;
            temp.next=y;
        }
    }
    void deleteAtTail(){
        if(Head.next==null) Head=Tail=null;
        else {
            Tail = Tail.pev;
            Tail.next = null;
        }
    }
    void deleteAtHead(){
        if(Head.next==null) Head=Tail=null;
        else {
            Head = Head.next;
            Head.pev = null;
        }
    }
    void delete(int idx){
        DNode temp = Head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp= temp.next;
        temp.pev=temp.pev.pev;
    }
    void display(){
        DNode temp = Head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class doubleLinkedList {
    public static void main(String[] args) {
        funDlist ll = new funDlist();
        ll.insertAtTail(10);
        ll.insertAtTail(20);
        ll.insertAtTail(30);
        ll.display();
        ll.insertAtHead(5);
        ll.insertAtHead(2);
        ll.insertAtHead(1);
        ll.display();
        ll.insertAtIndex(15,3);
        ll.display();
//        ll.deleteAtTail();
//        ll.deleteAtHead();
        ll.delete(3);
        ll.display();
    }
}
