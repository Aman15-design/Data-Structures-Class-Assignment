import java.util.*;
  
class prefixtopostfix
{       static final int max = 15;
        int top;
        String[] a = new String[max];
        public boolean isEmpty(){
            return (top<0);
        }
        public prefixtopostfix()
        {
            top = -1;
        }
        public boolean push(String x){
            if(top>=max){
                System.out.println("stack overflow");
                return false;
            }
            else{

                a[++top] = x;
                return true;
            }
        }
        public String pop(){

                String x = a[top--];

                return x;
        }
        public String peek(){

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
    static boolean isOperator(char x)
    {
        switch (x){
            case '-':
            case '+':
            case '/':
            case '*':
            case '^':
            return true;
        }
        return false;
    } 
  
    static String infixPostfix(String exp) 
    { 
          
        prefixtopostfix s= new prefixtopostfix(); 
            int length = exp.length(); 
            for (int i = length - 1; i >= 0; i--)  
            { 
                if (isOperator(exp.charAt(i)))  
             {
                    String a = s.pop(); 
                    String b = s.pop();
                    String temp = a + b + exp.charAt(i);
                    s.push(temp); 
                } 
                else
                {
                    s.push( exp.charAt(i)+""); 
                } 
            }
            return s.peek(); } 
    public static void main(String[] args)  
    { 
        Scanner sc=new Scanner(System.in);
        String exp = sc.nextLine(); 
        System.out.println("Postfix Expression: "+infixPostfix(exp)); 
        sc.close();
    } } 