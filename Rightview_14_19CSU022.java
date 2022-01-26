    class Node
{
    int data;
    Node left = null, right = null;
 
    Node(int data) {
        this.data = data;
    }
}
class Rightview_14_19CSU022
{

    public static int rightview(Node root, int level, int l_Level)
    {
        if (root == null) {
            return l_Level;
        }
        if (l_Level < level)
        {
            System.out.print(root.data + " ");
            l_Level = level;
        }
        l_Level = rightview(root.right, level+1, l_Level);
        l_Level = rightview(root.left, level+1, l_Level);

        return l_Level;
    }
    public static void rightView(Node root) {
        rightview(root, 1, 0);
    }
 
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
 
        rightView(root);
    }
}

 