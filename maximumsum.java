import java.util.*;
import static java.lang.System.exit; 

class maximumsum{ 
	private class Node { 
		int data; 
		Node next; 
	} 
	Node top; 
	maximumsum() 
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
  
  static void maximumsumin(maximumsum obj1,maximumsum obj2,maximumsum obj3,int s1,int s2,int s3)
  {
    int sum1=0;
    Node temp1=obj1.top;
    while(temp1!=null)
    {
      sum1=sum1+temp1.data;
      temp1=temp1.next;
    }
    int sum2=0;
    Node temp2=obj2.top;
    while(temp2!=null)
    {
      sum2=sum2+temp2.data;
      temp2=temp2.next;
    }
    int sum3=0;
    Node temp3=obj3.top;
    while(temp3!=null)
    {
      sum3=sum3+temp3.data;
      temp3=temp3.next;
    }
    Node t1=obj1.top;
    Node t2=obj2.top;
    Node t3=obj3.top;
    int fsum=0;
    int check=1;
    while(check!=0)
    {
      if(sum1==sum2 && sum2==sum3)
      {
        fsum=sum1;
        check=0;
        break;
      }

      if(sum1>=sum2 && sum1>=sum3)
      {
        sum1=sum1-t1.data;
        if(t1.next!=null)
          t1=t1.next;
        else
          check=0;
      }
      else if(sum2>=sum1 && sum2>=sum3)
      {
        sum2=sum2-t2.data;
        if(t2.next!=null)
          t2=t2.next;
        else
          check=0;
      }
      else if(sum3>=sum1 && sum3>=sum2)
      {
        sum3=sum3-t3.data;
        if(t3.next!=null)
          t3=t3.next;
        else
          check=0;
      }

    }
   System.out.println("Maximum sum for the above 3 stack is: "+fsum);
  }

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		maximumsum obj1 = new maximumsum(); 
    System.out.println("Enter the size of stack");
    int s1=sc.nextInt();
    System.out.println("Enter the stack with "+s1+" elements.........");
        for(int i=0;i<s1;i++)
        {
            obj1.push(sc.nextInt());
        }
    obj1.display();
    maximumsum obj2 = new maximumsum(); 
    System.out.println("Enter the size of stack");
    int s2=sc.nextInt();
    System.out.println("Enter the stack with "+s2+" elements.........");
        for(int i=0;i<s2;i++)
        {
            obj2.push(sc.nextInt());
        }  
      obj2.display();
      maximumsum obj3 = new maximumsum(); 
      System.out.println("Enter the size of stack");
      int s3=sc.nextInt();
      System.out.println("Enter the stack with "+s1+" elements.........");
          for(int i=0;i<s3;i++)
          {
              obj3.push(sc.nextInt());
          }
      obj3.display();
      System.out.println("Following are the stacks that you created...................");
      obj1.display();
      obj2.display();
      obj3.display();
      maximumsumin(obj1, obj2, obj3, s1, s2, s3);

		sc.close();
		 
	} 
} 
