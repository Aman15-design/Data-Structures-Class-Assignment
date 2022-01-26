// Question 9
import java.util.*;
public class rotate {
    Node head;
    static class Node 
     { 
         int data; 
         Node next; 
         Node previous;
        
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
         new_node.previous=null;
         if(head!=null)
         {
           head.previous=new_node;
         } 
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
     void anticlock(int s,int number)
     {
         Node temp=head;
         Node temp2=head;
         for(int i=1;i<s;i++)
         {
             temp=temp.next;
         }
         while(temp2.next!=null)
         {
             temp2=temp2.next;
         }
         temp2.next=head;
         head.previous=temp2;
         head=temp.next;
         head.previous=null;
         temp.next=null;
    }
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       rotate mylist=new rotate();
       System.out.println("\nEnter the number of elements you want to add in the linked list");
       int number= sc.nextInt();
       System.out.println("Enter Elements:");
       for(int i=0;i<number;i++)
       {
          int n=sc.nextInt();
          mylist.push(n);
       }
        System.out.println("List created by you :");
        mylist.printList();
        System.out.println("Enter the position of node aroud which list would be rotated");
        int n=sc.nextInt();
        mylist.anticlock(n,number);
        System.out.println("New list:");
        mylist.printList();
    
}
}
