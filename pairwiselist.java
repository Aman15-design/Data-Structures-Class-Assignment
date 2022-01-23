// SET A Q.5
import java.util.*;
public class pairwiselist
{
    Node head;
    static class Node 
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
    
     void pairswap()
    {
        Node temp = head; 
        int i;
    
        while (temp != null && temp.next != null) { 
  
            i = temp.data; 
            temp.data = temp.next.data; 
            temp.next.data = i; 
            temp = temp.next.next; 
        } 


    }

   
   
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       pairwiselist list=new pairwiselist();
       System.out.println("Enter the number of elements you want to add in the linked list");
       int number= sc.nextInt();
       System.out.println("Enter Elements:");
       for(int i=0;i<number;i++)
       {
          int n=sc.nextInt();
          list.push(n);
       }
        System.out.println("List created by you :");
        list.printList();
        
        System.out.println("\nPairwise swaping of elements of a given linked list ");
        list.pairswap();
        list.printList();
      
       
       
       
        
}
}