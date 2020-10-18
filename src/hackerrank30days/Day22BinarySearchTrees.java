package hackerrank30days;
import java.util.Scanner;

public class Day22BinarySearchTrees {
        public static int getHeight(Node22 root){
            //Write your code here
            if(root==null)
            {return -1;}
            int leftNode = getHeight(root.left);
            int rightNode = getHeight(root.right);
            if (leftNode > rightNode) {
                return leftNode + 1;
            } else {
                return rightNode + 1;
            }
        }

        public static Node22 insert(Node22 root,int data)
        {
            if(root==null){
                return new Node22(data);
            }
            else{
                Node22 cur;
                if(data<=root.data){
                    cur=insert(root.left,data);
                    root.left=cur;
                }
                else{
                    cur=insert(root.right,data);
                    root.right=cur;
                }
                return root;
            }
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node22 root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            int height=getHeight(root);
            System.out.println(height);
        }
}
