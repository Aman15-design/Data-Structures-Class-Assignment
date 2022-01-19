import java.util.*;
  
class infixtoPostfix 
{ 
   
    static final int max = 15;
        int top;
        char[] a = new char[max];
        public boolean isEmpty(){
            return (top<0);
        }
        public infixtoPostfix(){
            top = -1;

        }
        public boolean push(char x){
            if(top>=max){
                System.out.println("stack overflow");
                return false;
            }
            else{

                a[++top] = x;
                return true;
            }
        }
        public char pop(){

                char x = a[top--];

                return x;
        }
        public char peek(){

                return a[top];
        }
    

    static int Preccedence(char ch) 
    { 
        if(ch=='^')
        {
            return 3;
        }
        else if(ch=='+'||ch=='-')
        {
            return 1;
        }
        else if(ch=='*'||ch=='/')
        {
            return 2;
        }
        return 0;
    } 
  
    static String infixPostfix(String exp) 
    { 
        String result = new String(""); 
        infixtoPostfix stack = new infixtoPostfix(); 
          
        for (int i = 0; i<exp.length(); i++) 
        { 
            char c = exp.charAt(i); 
              
            if (Character.isLetterOrDigit(c)) 
                result = result+c; 
               
            else if (c == '(') 
                stack.push(c); 
       
            else if (c == ')') 
            {    
                while (!stack.isEmpty() && stack.peek() != '(') 
                    result=result+stack.pop(); 
                 
                if (stack.peek() != '(') 
                    return "Invalid Expression";             
                else
                    stack.pop();
                    
            } 
            else 
            { 
                while (!stack.isEmpty() && Preccedence(c)<=Preccedence(stack.peek())){ 
                    if(stack.peek() == '(') 
                        return "Invalid"; 
                    result=result+stack.pop(); 
             } 
                stack.push(c); 
            
            } 
       
        } 
        while (!stack.isEmpty()){ 
            if(stack.peek() == '(') 
                return "Invalid Expression"; 
            result=result+stack.pop(); 
         } 
        return result; 
    } 
    public static void main(String[] args)  
    { 
        Scanner sc=new Scanner(System.in);
        String exp = sc.nextLine(); 
        System.out.println("Postfix Expression: "+infixPostfix(exp)); 
        sc.close();
    } 
} 