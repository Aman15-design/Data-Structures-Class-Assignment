import java.util.*;

class Node
{
	Node next;
	String data;
	Node(String string)
	{
		this.data=string;
	}
}

public class Question_3 {
	static int size;
	static Node top=null;
	
	static void push(String string)
	{
		Node newnode=new Node(string);
		if(IsFull(newnode))
		{
			System.out.println("Your Stack is full !!!");
		}
		else
		{
			newnode.next=top;
			top=newnode;
		}		
	}
	static String pop()
	{
		if(IsEmpty())
		{
			System.out.println("Your stack is Empty !!!");
			return null;
		}
		else
		{
			Node temp=top;
			top=top.next;
			temp.next=null;
			return temp.data;
		}
			
		
		
	}
	
	static void peek()
	{
		System.out.println(top.data+" is at top of your stack!!!");
	}
	
	static boolean IsEmpty()
	{
		if(top==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	static boolean IsFull(Node newnode)
	{
		if(newnode==null)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	
	static void print()
	{
		System.out.print("[");
		while(top!=null)
		{
			System.out.print(pop()+" ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) 
	{
		Question_3 obj=new Question_3();
		System.out.println("Enter the string to reverse: ");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(a," ");
		while (st.hasMoreTokens()) 
		{
			obj.push(st.nextToken());
		}
		
		while(top!=null)
		{
			System.out.print(obj.pop()+" ");
		}
	
}
}
