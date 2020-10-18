/*
Objective
Today, we're going further with Binary Search Trees. Check out the Tutorial tab for learning materials and an instructional video!

Task
A level-order traversal, also known as a breadth-first search, visits each level of a tree's nodes from left to right, top to bottom. You are given a pointer,

, pointing to the root of a binary search tree. Complete the levelOrder function provided in your editor so that it prints the level-order traversal of the binary search tree.

Hint: You'll find a queue helpful in completing this challenge.

Input Format

The locked stub code in your editor reads the following inputs and assembles them into a BST:
The first line contains an integer,
(the number of test cases).
The subsequent lines each contain an integer,

, denoting the value of an element that must be added to the BST.

Output Format

Print the
value of each node in the tree's level-order traversal as a single line of

space-separated integers.

Sample Input

6
3
5
4
7
2
1

Sample Output

3 2 5 1 4 7



*/

package hackerrank30days;
import java.util.*;


public class Day23BSTLevelOrderTraversal {

    static void levelOrder(Node22 root){
        //Write your code here
       Queue<Node22> node22Queue = new LinkedList<>();
       node22Queue.add(root);
       while (!node22Queue.isEmpty())
       {
           Node22 current = node22Queue.remove();
           System.out.print(current.data +" ");
           if(current.left!=null) node22Queue.add(current.left);
           if(current.right!=null) node22Queue.add(current.right);
       }

    }

    public static Node22 insert(Node22 root,int data){
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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node22 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);

    }
}
