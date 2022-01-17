import java.util.*;
class Node
{
    int data;
    Node left = null, right = null;
 
    Node(int data) {
        this.data = data;
    }
}
class BST {

   
    // insertion
    static Node insertBST(Node root,int data)
    {
       
        if(root==null) // insertion for the first time
        {
            Node newNode=new Node(data);
            root=newNode;
            return root;
        }
        else
        {
            if(data<root.data)
            {
                root.left=insertBST(root.left,data);
            }
            else{
                root.right=insertBST(root.right,data);
            }
        }
        return root;
    }

    // Deletion
    static Node deletionBST(Node root,int key)
    {
        Node temp=root;
        Node parent=null;
        while(temp!=null && temp.data!=key)
        {    parent=temp;
            // if key is less than the current node than go to left subtree
            if(key<temp.data)
            {
                temp=temp.left;
            }
            else if(key>temp.data)
            {
                temp=temp.right;
            }

        }
        // At this point temp will point to the search key & parent will point to the parent node
        // Case 1: if the node to be deleted is a leaf node
        if(temp.right==null && temp.left==null)
        {
            // if the node to be delted is not a root node than set its parent's left or right child as null
            if(temp!=null)
            {
             if(parent.left==temp)
             {
                 parent.left=null;
             }
             else
             {
                 parent.right=null;
             }   
            }
        }
        // Case 2 : if the tree has only root node, Delete it and set root to null
        else if(root.left==null && root.right==null && root.data==key)
        {
            root=null;
        }
        if(temp.left==null || temp.right==null)
        {
            Node childnode=null;
            if(temp.left!=null)
            {
                childnode=temp.left;
            }
            else
            {
                childnode=temp.right;
            }
            if(temp!=root)
            {
                if(temp==parent.right)
                {
                    parent.right=childnode;
                }
                else
                {
                    parent.left=childnode;
                }
            }
            else
            {
                root=childnode;
            }
        }
        else if(temp.left!=null && temp.right!=null)
        {
            Node temp2=temp.right;
            Node curr=temp;
            while(temp2.left!=null)
            {
                temp2=temp2.left;
            }
           int value=temp2.data;
         deletionBST(root,temp2.data);
           temp.data=value;
        }
        
        
        return root;
    }

    // Traversal
    static void inorderBST(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorderBST(root.left);
        System.out.print(root.data+" ");
        inorderBST(root.right);
    }
    static void postorder(Node root)
    {
        if (root == null) 
        return; 
    postorder(root.left); 
    postorder(root.right); 
    System.out.print(root.data + " ");
    }
    static void printPreorder(Node root) 
    { 
        if (root == null) 
            return; 
        System.out.print(root.data + " "); 
        printPreorder(root.left); 
        printPreorder(root.right); 
    }
    public static void main(String args[])
    {
        Node root=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter");
        int n=sc.nextInt();
        int[] values=new int[n];
        System.out.println("Start entering "+n+" elements");
        for(int i=0;i<n;i++)
        {
            i++;
            System.out.println("Enter element at position "+i);
            i--;
            values[i]=sc.nextInt();
        }
        for(int value:values)
        {
            root=insertBST(root, value);
        }
        System.out.println(root.data);
        System.out.println("\nInorder Traversal:");
        inorderBST(root);
        System.out.println("\nPost order Traversal:");
        postorder(root);
        System.out.println("\nPre order Traversal:");
        printPreorder(root); 
        System.out.println("\nEnter the number you want to delete:");
        int m=sc.nextInt();
        deletionBST(root, m);
        System.out.println("\nInorder Traversal:");
        inorderBST(root);
}}
