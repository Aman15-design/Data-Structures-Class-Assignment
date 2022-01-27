
import java.util.Scanner;
class StackDemo{
    int top = -1; 
    static int size = 0;
    int[] stack = null; 
    static Scanner sc = new Scanner(System.in);
    
    StackDemo()
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

    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);

        StackDemo stackRef = new StackDemo();

        System.out.println("Enter "+size+" elements: ");
        for(int i = 0; i < size; i++){
            stackRef.push(sc.nextInt());
        }
        System.out.println("Element at the top of the stack is: "+stackRef.peek());
        stackRef.printStack();
        System.out.println("Element removed ffrom the top is: "+stackRef.pop());
        System.out.println("Elements inside stack are: ");
        stackRef.printStack();

        System.out.println();
        System.out.println("Stack is empty: "+stackRef.isEmpty());

    }
}
