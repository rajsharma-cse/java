package stack;

import java.util.Scanner;

class stack{
     int[] arr= new int[10];
     int top=-1;
     int buttom =-1;
}
class stk{
    static stack stk = new stack();
    boolean isEmpty(){
        if(stk.top == -1) return true;
        return false;
    }
    boolean isFull(){
        if(stk.top >= stk.arr.length-1) return true;
        return false;
    }

    void push(int val){
        if(isFull()){
            System.out.println("Stake overflow !");
        }else{
            if(stk.buttom ==-1) {
                stk.buttom++;
            }
            stk.top++;
            stk.arr[stk.top]=val;
        }
        System.out.println();

    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack underflow !");
        }else{
            System.out.println("The deleted element is "+stk.arr[stk.top]);
            stk.top--;
        }
        System.out.println();
    }
    void display(){
        if(isEmpty()){
            System.out.println("Stack underflow !");
        }else{
            System.out.println("Stack element is ");
            for(int i=stk.top;i>=0;i--){
                System.out.println(stk.arr[i]+" ");
            }
        }
        System.out.println();
    }
}
public class stackImp {

    public static void main(String[] args) {
        stk s = new stk();
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter the value: ");
                    int val = sc.nextInt();
                    s.push(val);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    flag= false;
                    break;
                default:
                    System.out.println("Enter vailed choice !");
            }
        }
    }
}
