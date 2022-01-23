import java.util.Scanner;
class postfixtoinfix
{
    int top = -1;

    void push(String data,String[] stack)
    {
        if(isfull(stack))
        {
            System.out.println("stack is full");
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
    int peek(char[] stack)
    {
        if(isempty()){
            System.out.println("empty stack");
            return 0;
        }
        else
        {
            
            return stack[top];
        }
    }

    void printstack(String[] stack){
        System.out.print("[");
      for(int i = top; i >= 0; i--){
            System.out.print(pop(stack) + " ");
      }
      System.out.print("]");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     postfixtoinfix obj = new postfixtoinfix();
    
    System.out.println("Enter the string");
    String exp = sc.nextLine();
    String[] stack = new String[exp.length()];
    String result = " ";

    for (int i =0 ; i <exp.length() ;i++)
    {
        char x = exp.charAt(i);
        if(x=='+' || x=='-' || x=='^'|| x=='*'||x=='/')
        {
            String a = obj.pop(stack);
            String b = obj.pop(stack);
             result = b+x+a;
            obj.push("("+result+")", stack);
        }
        else
        {
            obj.push(x+"", stack);
        }
    }
   obj.printstack(stack);
}
}