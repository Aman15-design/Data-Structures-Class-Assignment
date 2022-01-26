import java.util.*;
class stack_ques3{
 
    int top = -1;
 
    void push(String data,String[] stack)
    {
        if(isfull(stack))
        {
            System.out.println("full stack");
        }
        else
        {
            top = top+1;
            stack[top]  = data;
        }
    }
 
    String pop(String[] stack)
    {
        if(isempty()){
            System.out.println("empty stack");
            return " ";
        }
        else
        {
            String temp = stack[top];
            top = top-1;
            return temp;
        }
       
    }
 
    boolean isfull(String[] stack)
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
    String peek(String[] stack)
    {
        if(isempty()){
            System.out.println("empty stack");
            return " ";
        }
        else
        {
            
            return stack[top];
        }
    }
 
    void printstack(String[] stack){
      for(int i = top; i >= 0; i--){
            System.out.print(pop(stack) + " ");
      }
    }


 
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     StringTokenizer st = new StringTokenizer(s);
     stack_ques3 obj = new stack_ques3();
    // int size = sc.nextInt();
     String[] stack = new String[s.length()];
     while(st.hasMoreTokens()){
         obj.push(st.nextToken(),stack);
     }
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Reverse Sentence:");
    System.out.println(" ");
    System.out.println(" ");
    obj.printstack(stack);
 
}
}