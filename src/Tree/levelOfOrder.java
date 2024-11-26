package Tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class levelOfOrder {

    public static void mirr(Node root){
        if(root==null) return;
        Node temp =root.left;
        root.left=root.right;
        root.right=temp;
        mirr(root.left);
        mirr(root.right);

    }

    public static void print(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        print((root.left));
        print(root.right);
    }

    public static boolean flag=true;
    public static void altrInOder(Node root){
        if(root==null) return;
        if(flag==true){
            System.out.print(root.val+" ");
            flag=false;
        }else{
            flag=true;
        }
        altrInOder(root.left);
        altrInOder(root.right);
    }

    public static int hight(Node root){
        if(root==null) return 0;
        return 1+ Math.max(hight(root.right),hight(root.left));
    }

    public static void Oder(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while (q.size()>0){  // !q.isEmpty()
            Node temp =(Node) q.remove(); //q.poll()
            System.out.print(temp.val+" ");
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
        }
    }

    public static void in(Node root){
        if(root==null) return;
        in(root.left);
        System.out.print(root.val+" ");
        in(root.right);
    }


//    public static boolean flag=true;
    public static void inoder(Node root){
        if(root==null) return;
        inoder(root.left);
        if(flag){
            System.out.print(root.val+" ");
            flag=false;
        }else flag=true;

        inoder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);
        Node e = new Node(60);
        Node f = new Node(70);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
//        print(root.left);
//        System.out.println("Level order traversal:");
//        Oder(root);
//        System.out.println();
//        in(root);
//        System.out.println();
//        inoder(root);
//        System.out.println(flag);
//        altrInOder(root);
        System.out.print(hight(root));
    }
}
