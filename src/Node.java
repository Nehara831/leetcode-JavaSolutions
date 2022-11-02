public class Node {

    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        left=right=null;
    }
}
class treeNode{
    static int min1;
    static boolean flag=true;
    public static void printNode(Node root){
        if(root==null)
            return ;
        System.out.println(root.data);
        printNode(root.left);
        printNode(root.right);
    }
    public static int findMin(Node root,int min){
        if(root==null)
            return min;
        if(root.data<=min)
            min=root.data;
        min=findMin(root.left,min);
        min=findMin(root.right,min);
        return min;
    }
    public static boolean isEqaul(Node root1,Node root2){
        if(root1==null||root2==null) {
            if(root1==null&&root2!=null||root1!=null&&root2==null)
                return false;
            return true;
        }
        if(root1.data!=root2.data) {
            return false;
        }
        return isEqaul(root1.left,root2.left)&& isEqaul(root1.right,root2.right);
    }
    public static boolean isBinary(Node root,int lower,int higher){
        if(root==null)
            return true;
        if(root.data<lower|| root.data>higher)
            return false;

        return isBinary(root.left,lower,root.data)&& isBinary(root.right,root.data,higher);

    }
    public static void countLevel(Node root,int count,int level){
        if(count==level)
            System.out.println(root.data);
        if(root.left==null&& root.right==null)
            return;

        count++;
        countLevel(root.left,count,level);
        if(root.right!=null)
        countLevel(root.right,count,level);

    }
    public static void main(String args[]){
        Node root=new Node(11);
        root.left=new Node(7);
        root.right=new Node(20);
        root.left.left=new Node(5);
        root.left.right=new Node(9);
        root.left.left.left=new Node(3);
        root.left.right.right=new Node(10);
        root.right.left=new Node(2);
        root.left.right.left=new Node(8);
        //printNode(root);
        Node root2=new Node(0);
        root2.left=new Node(-8);
        root2.right=new Node(-12);
        root2.left.left=new Node(12);
        root2.left.right=new Node(1);
        root2.left.left.left=new Node(34);
        root2.left.left.right=new Node(23);
        root2.right.left=new Node(2);
        root2.right.right=new Node(-5);
        //System.out.println(isBinary(root,-500,500));
        countLevel(root,1,4);






        //System.out.println(findMin(root,root.data));
    }
}
