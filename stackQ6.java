import java.util.*;
  
public class stackQ6 
{     int top = -1; 
    static int size = 0;
    int[] stack = null; 
    static Scanner sc = new Scanner(System.in);
    
    stackQ6()
    {
      System.out.println("Enter the stack size: ");
      size = sc.nextInt();
      stack = new int[size];
    }
   void push(int data){
         
          if(isFull()){
              System.out.println("Overflow!!! No more space left...!");
          }
          else{
                top = top+1;
                stack[top] = data;
          }
    }

 
    int pop(){
        if(isEmpty()){
            System.out.println("Underflow!!!... Stack is Empty!");
            return 0;
        }
        else{
            int temp = stack[top];
            top = top-1;
            return temp;
        }
    }

    
    int peek(){
        if(isEmpty()){
          System.out.println("Underflow!!!... Stack is Empty!");
          return 0;
        }
        else
            return stack[top];
    }

   
    boolean isFull(){
        if(stack.length <= top)
          return true;
        else
          return false;
    }

    
    boolean isEmpty(){
        if(top < 0)
          return true;
        else
          return false;
    }

    void printStack(){
      System.out.print("[");
      for(int i = top; i >= 0; i--){
            System.out.print(pop()+" ");
      }
      System.out.print("]");
    }

    static void del(stackQ6 stack)
    {
        stackQ6 t=new stackQ6();

        while(!stack.isEmpty())
        {
            int m=stack.pop();
            if(m % 2==0)
            {
                t.push(m);
            }
        }

        while(t.isEmpty()==false)
        {
            stack.push(t.pop());
        }
    }
    public static void main(String[] args)  
    { 
        Scanner sc=new Scanner(System.in);
        stackQ6 stack=new stackQ6();
    
        System.out.println("Start entering......");
        for(int i=0;i<size;i++)
        {
          int x=sc.nextInt();
          stack.push(x);
        }
        
        Stack<Integer> t=new Stack<Integer>();

        while(!stack.isEmpty())
        {
            int m=stack.pop();
            if(m % 2==0)
            {
                t.push(m);
            }
        }

        while(t.isEmpty()==false)
        {
            stack.push(t.pop());
        }
        System.out.println("Modified Stack: ");
        stack.printStack(); 
        sc.close();
    } 
} 