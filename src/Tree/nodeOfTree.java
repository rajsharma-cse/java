//package Tree;
//class Node{
//    int val;
//    Node left;
//    Node right;
//    Node (int val){
//        this.val=val;
//    }
//}
//class queue{
//    static Node[] arr = new Node[40];
//    int f = -1;
//    int r = -1;
//}
//
//public class nodeOfTree {
//    public static void display(Node temp){
//        if(temp == null) return;
//        System.out.println(temp.val);
//        display(temp.left);
//        display(temp.right);
//    }
//
//    public static int sum(Node temp){
//        if(temp == null) return 0;
//        return temp.val + sum(temp.left) + sum(temp.right);
//    }
//
//    public static long mul(Node temp){
//        if(temp == null ) return 1;
//        return temp.val * mul(temp.left) * mul(temp.right);
//    }
//    public static int size(Node temp){
//        if(temp==null) return 0;
//        return 1+size(temp.left)+size(temp.right);
//
//    }
//
//    public static long nonZero(Node temp){
//        if(temp== null ) return 1;
//        if(temp.val == 0) return 1;
//        System.out.println(temp.val);
//        return temp.val * nonZero(temp.left) * nonZero(temp.right);
//    }
//    public static int MAX(Node temp){
//        if(temp==null) return Integer.MIN_VALUE;
//        return Math.max(temp.val, Math.max(MAX(temp.left), MAX(temp.right)));
//    }
//    public static int MIN(Node temp){
//        if(temp==null) return Integer.MAX_VALUE;
//        return Math.min(temp.val, Math.min(MIN(temp.left), MIN(temp.right)));
//    }
//    private TreeNode root;
//
//    public void levelOfOrder(int[] elements) {
//        root = createTree(elements, 0);
//    }
//
//    private TreeNode createTree(int[] elements, int index) {
//        if (index < elements.length) {
//            TreeNode node = new TreeNode(elements[index]);
//            node.left = createTree(elements, 2 * index + 1);
//            node.right = createTree(elements, 2 * index + 2);
//            return node;
//        }
//        return null;
//    }
//    public void levelOrderTraversal() {
//        if (root == null) {
//            return;
//        }
//
//        Queue queue = new Queue();
//        queue.enqueue(root);
//
//        while (!queue.isEmpty()) {
//            TreeNode currentNode = queue.dequeue();
//            System.out.print(currentNode.value + " ");
//
//            if (currentNode.left != null) {
//                queue.enqueue(currentNode.left);
//            }
//            if (currentNode.right != null) {
//                queue.enqueue(currentNode.right);
//            }
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        Node root = new Node(10);
//        Node a = new Node(20);
//        Node b = new Node(1);
//        Node c = new Node(40);
//        Node d = new Node(110);
//        Node e = new Node(60);
//        Node f = new Node(70);
//        root.left=a; root.right=b;
//        a.left=c; a.right=d;
//        b.left=e; b.right=f;
//        display(root);
//        System.out.println("The sum of root is "+sum(root));
//        System.out.println(("The multiple is "+mul(root)));
//        System.out.println(("The multiple of NON-ZERO is "+nonZero(root)));
//        System.out.println("The MAXIMUN number is "+MAX(root));
//        System.out.println("The MAXIMUN number is "+MIN(root));
//        System.out.println("The size of Binnary tree is "+size(root));
//    }
//}
