import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class circlularlist
{ 
    public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
    public Node head = null;  
    public Node tail = null;  
 
public void push(int new_data) 
{ 
    Node newNode=new Node(new_data);
    if(head == null) {  
        
       head = newNode;  
       tail = newNode;  
       newNode.next = head;  
   }  
   else {  
      
       tail.next = newNode;  
       
       tail = newNode;  
      
       tail.next = head;  
   }  
} 
public void printList() 
{ 
    Node n = head; 
    System.out.print(n.data + " "); 
    n=n.next;
    while (n != head) { 
        System.out.print(n.data + " "); 
        n = n.next; 
    } 
} 
void insert(int pos, int num)
{  
    Node temp=head;
    Node new_node = new Node(num); 
   if(pos>1)
   {
    for(int i=1;i<pos-1;i++)
    {
        temp=temp.next;
    }
    if(temp.next==tail)
    {
        push(num);
    }
    else {
    new_node.next=temp.next.next;
    temp.next=new_node;
    }
}
else
{
    tail.next=new_node;
    new_node.next=head;
    head=new_node;
}
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
       circlularlist mylist=new circlularlist();
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
        mylist.insert(pos, num);
        System.out.println("List after insertion inserted:");
        mylist.printList();
        System.out.println("\n*************************************Deletion************************************************");
        System.out.println("\nEnter the position of node to be delted");
        int n=sc.nextInt();
        int position=n-1;
         mylist.deletenode(position);
        System.out.println("\nLinked List after Deletion is: ");
        mylist.printList();
        sc.close(); 

    }
}