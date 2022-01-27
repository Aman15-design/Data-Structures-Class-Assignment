import java.util.*;
import static java.lang.System.exit; 

class Stack_ques2{ 
	private class Node { 
		int data; 
		Node next; 
	} 
	Node top; 
	Stack_ques2() 
	{ 
		this.top = null; 
	}  
	public void push(int x)
	{ 
    	Node temp = new Node();  
		temp.data = x;  
		temp.next = top; 
		top = temp; 
	} 
 
	public boolean isEmpty() 
	{ 
		return top == null; 
	} 

	public int peek() 
	{ 
		if (!isEmpty()) { 
			return top.data; 
		} 
		else { 
			System.out.println("Stack is empty"); 
			return -1; 
		} 
	}  
	public void pop() 
	{ 
		
		if (top == null) { 
			System.out.print("\nStack Underflow"); 
			return; 
		} 
		
		top = top.next; 
	} 

	public void display() 
	{ 
		
		if (top == null) { 
			System.out.printf("\nStack Underflow"); 
			exit(1); 
		} 
		else { 
            Node temp = top; 
            System.out.print("[ ");
			while (temp != null) { 

				System.out.printf(" %d ", temp.data); 

				
				temp = temp.next; 
            } 
            System.out.println("]");
		} 
	} 

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		Stack_ques2 obj = new Stack_ques2(); 
        System.out.println("Enter the size of stack");
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            obj.push(sc.nextInt());
        }
		obj.display();  
		System.out.printf("\nAfter Pop operation"); 
        obj.pop(); 
        obj.display();
        System.out.println("\nPush operation");
        System.out.println("\nEnter the number you want to be pushed");
        int n=sc.nextInt();
        obj.push(n);
		obj.display(); 
		sc.close();
		 
	} 
} 
