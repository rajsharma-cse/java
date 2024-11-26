package BST;

import java.util.ArrayList;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}
public class createBST {
    public static Node insert(Node root,int data){

        if(root == null){
            return (new Node(data));

        }
        if(root.data>data){
            root.left=insert(root.left,data);
        }else{
            root.right=insert(root.right,data);
        }
        return root;
    }

    public static void inOder(Node root){
        if(root==null){
            return;
        }
        inOder(root.left);
        System.out.print(root.data+" ");
        inOder(root.right);
    }

    public static boolean search(Node root,int data){
        if(root == null) return false;
        if(root.data == data) return true;
        if(root.data > data) return search(root.left,data);
        else return search(root.right,data);
    }

    public static Node delete(Node root,int data){
        if(root.data>data){
            root.left = delete(root.left,data);
        }else if(root.data<data){
            root.right=delete(root.right,data);
        }else{
            if(root.left==null && root.right==null){
                return null;
            }else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }else{
                Node temp = inOderSucc(root);
                root.data = temp.data;
                root.right = delete(root.right,temp.data);
            }
        }
        return root;
    }
    public static Node inOderSucc(Node root){
        while (root.left!= null){
            root=root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2){
        if(root == null) return;
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.right,k1,k2);
        } else if (root.data<k1) {
            printInRange(root.left,k1,k2);
        }else {
            printInRange(root.right,k1,k2);
        }
    }

    public static void rootToLeaf(Node root, ArrayList<Integer> path){
        if(root == null ) return ;
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }
        rootToLeaf(root.left,path);
        rootToLeaf(root.right,path);
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" -> ");
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int[] arr = {8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int e : arr) {
            root = insert(root, e);
        }

        inOder(root);
        System.out.println();
//        if(search(root,20)){
//            System.out.println("found");
//        }else{
//            System.out.println("Not found! ");
//        }
        System.out.println();
//        delete(root,1);
//        inOder(root);
//        System.out.println();
//        printInRange(root,2,10);
        rootToLeaf(root,new ArrayList<>());
    }
}
