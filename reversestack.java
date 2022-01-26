import java.util.*;
public class reversestack
{      static final int max = 15;
    int top;
    char[] a = new char[max];
    public boolean isEmpty(){
        return (top<0);
    }
    public reversestack()
    {
        top = -1;
    }
    public boolean push(char x)
    {
        if(top>=max){
            System.out.println("stack overflow");
            return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
    }
    boolean isempty(){
        if(top < 0)
          return true;
        else
          return false;
    }
    public char pop(){
            char x = a[top--];
            return x;
    }
    public char peek(){

            return a[top];
    }
    void printStack(){
        for(int i = top; i >= 0; i--){
              System.out.print(pop()+"");
        }
      }
static void reverse(String s)
{
  Stack<String> rev = new Stack<>();
  String temp = "";
  for(int i = 0; i < s.length(); i++)
  {
    if(s.charAt(i) == ' ')
    {
        rev.add(temp); 
      temp = "";          
    }
    else
    {
      temp = temp + s.charAt(i);
    }
   }
rev.add(temp);
while(!rev.isEmpty()) 
{
  temp = rev.peek();
  System.out.print(temp + " ");
  rev.pop();
}
 
System.out.println();
}
    public static void main(String[] args)  
    { 
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        reversestack stack=new reversestack();
        for (int i = 0; i < str.length();i=i+1) { 
            if (str.charAt(i) != ' ')
            { 
                stack.push(str.charAt(i)); 
            }
        } 
  
        System.out.println("");
        reverse(str);
        sc.close();
    } 
} 