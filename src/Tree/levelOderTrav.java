package Tree;

import java.util.*;

public class levelOderTrav {
    public static class Pair{
        Node node;
        int level;
        Pair(Node node,int level){
            this.node=node;
            this.level=level;
        }
    }
    public static void mirr(Node root){
        if(root==null) return;
        Node temp =root.left;
        root.left=root.right;
        root.right=temp;
        mirr(root.left);
        mirr(root.right);

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
        dis(root);
        System.out.println();
        mirr(root);
        dis(root);
    }
    public static void dis(Node root){
        int prevLevel=0;
        Queue<Pair> q = new LinkedList<>();
        if(root!= null) q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front = q.remove();
            Node temp = front.node;
            int lvl= front.level;
            if(lvl!=prevLevel){
                System.out.println();
                prevLevel++;
            }
            System.out.print(temp.val+" ");
            if(temp.left!=null) q.add(new Pair(temp.left,lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right,lvl+1));

        }
    }
}
