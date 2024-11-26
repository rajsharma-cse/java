//import java.util.*;
//class Stack{
//    static int[] stack=new int[5];
//    static int top=-1;
//    public static boolean isEmpty()
//    {
//        return (top==-1);               //will return true if top==-1,to check stck is empty or not
//    }
//    public static boolean isFull()
//    {
//        return  (top==stack.length-1);    //will return true if top==stack.length-1,chks stck is full
//    }
//    public static void push(int ele)
//    {
//        if(isFull())
//        {System.out.println("THE STACK IS FULL AND NO ELEMENT CAN BE INSERTED");}
//        else
//        {top++;
//            stack[top]=ele;}
//    }
//    public static int pop()
//    {
//        if(isEmpty())
//        {
//            System.out.println("THE STACK IS EMPTY  AND NO ELEMENT CAN BE POPPED OUT");
//            return -1;
//        }
//        else
//        {
//            int poppedElement=stack[top];
//            System.out.println("the popped element is="+poppedElement);
//            top--;
//            return poppedElement;
//
//        }}
//    public static void disp()
//    {System.out.println("THE STACK IS :");
//        System.out.println(top);
//        for(int i=top;i>=0;i--)
//        {
//            System.out.println(stack[i]);
//        }
//    }
//}
//public class stack1 {
//    public static void main(String args[])
//    {
//        Stack s=new Stack();
//        Scanner sc=new Scanner(System.in);
//
//        boolean repeat =false;
//        do{
//            System.out.println("ENTER YOUR CHOICE 1.PUSH 2.POP 3.DISPLAY");
//            int choice=sc.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("enter the element to push");
//                    int ele=sc.nextInt();
//                    s.push(ele);
//
//                    break;
//                case 2:
//                    s.pop();
//
//                case 3:
//                    s.disp();
//                default:
//                    System.out.println();
//                    break;
//            }}while(repeat==false);
//        //    s.push(23);
//        //    s.push(12);
//        //    s.push(16);
//        //    s.push(11);
//        //    s.push(123);
//        //    s.pop();
//        //    s.push(32);
//        //    s.push(3);
//        //    s.disp();
//    }
//}