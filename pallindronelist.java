import java.util.Scanner;

public class pallindronelist{
    

    Node head;
    static class Node 
    { 
        char data; 
        Node next; 
       
        Node(char d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
      
    void inseratBegg(char a)
    {
        Node new_node = new Node(a);
          
        new_node.next=head;
        head=new_node;
    }

    
    void Traversal()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(" "+temp.data);
            temp = temp.next;
        }

    }

    
    void palindrome(int size) {
        Node temp1 = head;
        int pos =0;
        boolean flag = true;
        while(temp1!=null) 
        {
            Node temp2 = head;
            for(int i =0;i<size-pos-1;i++) {
                temp2 = temp2.next;
            }
            if(temp1.data != temp2.data)
            {
                flag = false;
                break;
            }
            temp1 = temp1.next;
            pos++;
        }
        if (flag==true){
            System.out.println("\nList is Palindrome");
        }
        else {
            System.out.println("\nList is not Palindrome");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pallindronelist list = new pallindronelist();
        System.out.print("Enter the number of elements:");
        int size = sc.nextInt();

      
        System.out.println("Enter the elements: ");
        for(int i =0; i<size;i++)
        {
            list.inseratBegg(sc.next().charAt(0));
        }
        list.Traversal();

        
        list.palindrome(size);


    }
}
