// Set A Q.1

import java.time.temporal.Temporal;
import java.util.*;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
public class operations
{ 
    Node head;
    Node tail;
   private class Node 
    { 
        int data; 
        Node next; 
       
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
    public void printList() 
    { 
        Node n = head; 
        while (n != null) { 
            System.out.print(n.data + " "); 
            n = n.next; 
        } 
    } 
    void insertend(int num3)
    {
        Node new_node = new Node(num3); 
        Node temp = head; 
        while (temp.next != null)
        { 
        temp=temp.next; 
        }
        temp.next=new_node;

    }
    void insertbeg(int num2)
    {
        Node new_node = new Node(num2);
          
        new_node.next=head;
        head=new_node;
    }
    void insert(int pos, int num)
    {  
        Node temp=head;
        Node new_node = new Node(num); 
        Node temp3=head;
       if(pos>1)
       {
        for(int i=0;i<pos;i++)
        {
            if(i>0)
            {
                temp3=temp3.next;
            }
            temp=temp.next;
        }
     new_node.next=temp;
     temp3.next=new_node;
    }
    else
    {
        new_node.next=head;
        head=new_node;
    }
    }
    void deleteatbegg()
    {
        Node temp=head;
        head=temp.next;
        temp=null;
    }
    void deletionatend()
    {
      
        if(head==null)
        return;
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
    
        temp.next=null;
        


    }
    void deletenode(int position)
    {
        if(head==null)
        return;
      
        Node temp=head;
        if(position==0)
        {
            head=temp.next;
            temp=null;  
        }
        else
        {
        for(int i=0;i<position-1;i++)
        {
            temp=temp.next;
        }
    
        Node next=temp.next.next;
        temp.next=next;
    }
}



   
   

    
   
    
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       operations mylist=new operations();
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
        int pos=pos1-1;
        System.out.println("Enter the number to be inserted:");
        int num=sc.nextInt();
        mylist.insert(pos, num);
        System.out.println("List after insertion inserted:");
        mylist.printList(); 
        System.out.println("\nEnter the number to be inserted at beginnig:");
        int num2=sc.nextInt();
        mylist.insertbeg(num2);
        System.out.println("After insertion at the beginnig");
        mylist.printList();
        System.out.println("\nEnter the number to be inserted at the end:");
        int num3=sc.nextInt();
        mylist.insertend(num3);
        System.out.println("After insertion at the end");
        mylist.printList(); 
        
        System.out.println("\n*************************************Deletion************************************************");
        System.out.println("\nEnter the position of node to be delted");
        int n=sc.nextInt();
        int position=n-1;
        mylist.deletenode(position);
        System.out.println("\nLinked List after Deletion is: "); 
        mylist.printList(); 
        mylist.deletionatend();
        System.out.println("\nLinked List after Deletion at the end is: ");
        mylist.printList();
        System.out.println("\nLinked List after Deletion at the beggining is: "); 
        mylist.deleteatbegg();
        mylist.printList();
        sc.close(); 

    }
}