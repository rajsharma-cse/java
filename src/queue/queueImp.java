package queue;
import java.util.Scanner;
class queue{
    static int[] arr = new int[10];
    static int fount = -1;
    static int rear = -1;
}

class QueueOpr{
    queue qu = new queue();
    boolean isEmpty(){
        if(qu.fount==-1 && qu.rear==-1) return true;
        if(qu.fount >qu.rear) return true;
        return false;
    }
    boolean isfull(){
        if(qu.rear == qu.arr.length-1) return true;
        return false;
    }
    void insert(int val){
        if(isfull()){
            System.out.println("Queue is overflow !");
        }else{
            if(qu.fount!=0) qu.fount++;
            qu.rear++;
            qu.arr[qu.rear]=val;
        }
        System.out.println();
    }
    void delete(){
        if(isEmpty()){
            System.out.println("Queue underflow !");
        }else{
            System.out.println("The deleted element is "+qu.arr[qu.fount]);
            qu.fount++;
        }
        System.out.println();
    }
    void display(){
        if(isEmpty()){
            System.out.println("Queue is underflow !");
        }else{
            System.out.println("your Queue is ");
            for(int i=qu.fount;i<=qu.rear;i++){
                System.out.println(qu.arr[i]);
            }
        }
        System.out.println();
    }
}
public class queueImp {
    public static void main(String[] args) {
        QueueOpr q = new QueueOpr();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("1.Insert\n2.Delete\n3.Display\n4.Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    q.insert(val);
                    break;
                case 2:
                    q.delete();;
                    break;
                case 3:
                    q.display();;
                    break;
                case 4:
                    flag=false;
                    break;

                default:
                    System.out.println("Invailed choice !");
            }
        }
    }
}

