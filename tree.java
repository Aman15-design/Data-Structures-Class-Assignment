import java.util.*;
class Node
{
    int key;
    Node left;
    Node right;
    public Node(int data) 
    { 
        key = data; 
        left = right = null; 
    }
}
class tree 
{ 
    Node root; 
    tree(int key) 
    { 
        root = new Node(key); 
    } 
  
    tree() 
    { 
        root = null; 
    }
	public static void main(String[] args)
    {
        tree tree = new tree();
        tree.root=new Node(1);
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
	}
}