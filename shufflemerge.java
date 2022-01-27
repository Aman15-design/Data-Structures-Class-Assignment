// question 7
import java.util.*;
public class shufflemerge {
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
    void shufflemergelist(shufflemerge mylist2)
    {
        Node temp= head;
        Node temp2=mylist2.head;
            
            int i=2;
            shufflemerge newlist=new shufflemerge();
            shufflemerge newlist2=new shufflemerge();
            while(temp!=null && temp2!=null)
            {
               if(i%2==0)
               {
                   newlist.push(temp2.data);
                   temp2=temp2.next;
               }
               else
               {
                   newlist.push(temp.data);
                   temp=temp.next;
               }
              i=i+1;
            }
            if(temp!=null)
            {
                while(temp!=null)
                {
                    newlist.push(temp.data);
                    temp=temp.next;
                }
            }
            else if(temp2!=null)
            {
                while(temp2!=null)
                {
                
                    newlist.push(temp2.data);
                    temp2=temp2.next;
                } 
            }
            System.out.println("\nNew list is:");
            
            Node temp3=newlist.head;
            while(temp3!=null)
            {
               newlist2.push(temp3.data);
               temp3=temp3.next;
            }
            newlist2.printList();
        }
public static void main(String args[]) 
    { 
        shufflemerge mylist1 = new shufflemerge(); 
        shufflemerge mylist2 = new shufflemerge();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add in the linked list");
       int number= sc.nextInt();
       System.out.println("Enter Elements:");
       for(int i=0;i<number;i++)
       {
          int n=sc.nextInt();
          mylist1.push(n);
       }

        System.out.println("First List created by you :");
        mylist1.printList();
        System.out.println("\nEnter the number of elements you want to add in the linked list");
        int number2= sc.nextInt();
        System.out.println("\nEnter Elements of list 2:");
        for(int i=0;i<number2;i++)
        {
           int n1=sc.nextInt();
           mylist2.push(n1);
        }
         System.out.println("Second List created by you :");
         mylist2.printList();
        
         sc.close();
        mylist1.shufflemergelist(mylist2);
}
}