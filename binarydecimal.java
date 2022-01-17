import java.util.*;
public class binarydecimal {
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


    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       binarydecimal list=new binarydecimal();
       System.out.println("Enter decimal number");
       int number= sc.nextInt();
       int rem=0;
       while(number>0)
       {
           rem=number%2;
           number=number/2;
           list.push(rem);
       }

       System.out.println("Binary for the decimal is:");
       list.printList();
       sc.close();
}
}
