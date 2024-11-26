package Tree;

import java.util.Scanner;

public class NThLevel {
    static int n;
    public static void nThLevel(Node root, int level){
        if(root == null) return;
        if(level==n) System.out.print(root.val+" ");
        nThLevel(root.left,level+1);
        nThLevel(root.right,level+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        System.out.print("Enter the level: ");
        n = sc.nextInt();
        nThLevel(root, 0);
        // print full tree (BFS) without using queue
        for (int i =0;i<=2;i++){
            n = i;
            nThLevel(root, 0);
            System.out.println();
        }
    }
}
