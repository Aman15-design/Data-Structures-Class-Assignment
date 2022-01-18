import java.util.*;
public class doublylinkedlist {

    public class Node{
        int data;
        Node next=null;
        Node previous=null;
        public Node(int data)
        {
            this.data=data;
        }
    }
    public Node head=null;
    public void push(int data)
    {
        Node new_node=new Node(data);
        if(head==null)
        {
            new_node.next=null;
            new_node.previous=null;
            head=new_node;
        }
        else
        {
            new_node.next=head;
            head.previous=new_node;
            head=new_node;
        }
    }
    public void pushlast(int data)
    {
        Node new_node=new Node(data);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=new_node;
        new_node.previous=temp;
    }
    public void insertnew(int pos,int data)
    {
        Node new_node=new Node(data);
        Node temp=head;
        if(pos==1)
        {
            push(data);
        }
        else
        {
            int i=1;
            while(i<pos-1)
            {
                System.out.println("Temp.data= "+temp.data);
                temp=temp.next;
                i++;
            }
            if(temp.next==null)
            {
                pushlast(data);
                return;
            }
            Node temp_2=temp.next;
            temp.next=new_node;
            new_node.previous=temp;
            new_node.next=temp_2;
            temp_2.previous=new_node;
        }
    }
    public void printList() 
    { 
        Node n = head; 
        while (n != null) { 
            System.out.print(n.data + " "); 
            n = n.next; 
        } 
    }  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        doublylinkedlist mylist=new doublylinkedlist();
        System.out.println("Enter the number of elements you want to add in the linked list");
        int number= sc.nextInt();
        System.out.println("Enter Elements:");
        for(int i=0;i<number;i++)
        {
           int n=sc.nextInt();
           mylist.push(n);
        }
         System.out.println("List created by you :");
         mylist.printList();
 
         System.out.println("\n*************************************Insertion************************************************");
         System.out.println("\nEnter the position where you want to insert:");
         int pos1=sc.nextInt();
         int pos=pos1;
         System.out.println("Enter the number to be inserted:");
         int num=sc.nextInt();
         mylist.insertnew(pos1, num);
         System.out.println("List after insertion inserted:");
         mylist.printList();

    }
    
}
