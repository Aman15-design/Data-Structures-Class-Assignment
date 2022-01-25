import java.util.*;
class q6{

    int top = -1;
    void push(int data,int[] stack)
    {
        if(isfull(stack))
        {
            System.out.println("jagah nahi hai");
        }
        else
        {
            top = top+1;
            stack[top]  = data;
        }
    }
    int pop(int[] stack)
    {
        if(isempty()){
            System.out.println("khaali hai");
            return 0;
        }
        else
        {
            int temp = stack[top];
            top = top-1;
            return temp;
        }
       
    }

    boolean isfull(int[] stack)
    {
        if(stack.length <= top)
        return true;
      else
        return false;
    }

    boolean isempty(){
        if(top < 0)
          return true;
        else
          return false;
    }
    int peek(int[] stack)
    {
        if(isempty()){
            System.out.println("khaali hai");
            return 0;
        }
        else
        {
            
            return stack[top];
        }
    }

    void printstack(int[] stack)
    {
        System.out.print("[");
      for(int i = top; i >= 0; i--){
            System.out.print(pop(stack) + " ");
      }
      System.out.print("]");
    }


    void delete_odd(int[] stack,int[] temp, int size)
    {
        for(int i = 0 ; i < size ; i++)
     {
           int tempint = stack[i];
           if(tempint%2==0)
           {
            push(tempint,temp);
           }
        }
    
       printstack(temp);

    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     q6 obj = new q6();
     System.out.println("Enter the size of the stack");
     int size = sc.nextInt();
     int[] stack = new int[size];
     int j=0;
     for(int i = 0 ; i < size ; i++)
     {
         int m=sc.nextInt();
         obj.push(m,stack);
         if(m%2==0)
         {
             j=j+1;
         }
     }
     int[] temp=new int[j];
     System.out.print("You entered: ");
     obj.printstack(stack);
     System.out.println("\nAfter deleting odd element:");
     
      obj.delete_odd(stack, temp,size);
   //  obj.printstack(temp);


    }
}