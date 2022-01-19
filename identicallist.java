import java.util.*;
class identicallist 
{ 
    Node head; 
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) { data = d; next = null; } 
    } 
     void printList() 
    { 
        Node n = head; 
        while (n != null) { 
            System.out.print(n.data + " "); 
            n = n.next; 
        } 
    } 

    boolean Identical(identicallist mylist2) 
    { 
        Node temp = this.head, temp2 = mylist2.head; 
        while (temp != null && temp2 != null) 
        { 
            if (temp.data != temp2.data) 
                return false; 

            
            temp = temp.next; 
            temp2 = temp2.next; 
        } 

        
        return true;
    } 

    

    void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 

    
        new_node.next = head; 

        head = new_node; 
    } 


    
    public static void main(String args[]) 
    { 
        identicallist  mylist1 = new identicallist (); 
        identicallist  mylist2 = new identicallist (); 
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
        System.out.println("\nEnter Elements of list 2:");
        for(int i=0;i<number;i++)
        {
           int n1=sc.nextInt();
           mylist2.push(n1);
        }
         System.out.println("Second List created by you :");
         mylist2.printList();
        if (mylist1.Identical(mylist2) == true) 
            System.out.println("\nBoth the lists are Identical "); 
        else
            System.out.println("\nLists are Not identical "); 

    } 
}
