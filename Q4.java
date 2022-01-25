import java.util.*;
public class Q4 {
        static final int max = 15;
        int top;
        char[] a = new char[max];
        public boolean isEmpty()
        {
            return (top<0);
        }
        public Q4()
        {
            top = -1;
        }
        public boolean push(char x)
        {
            if(top>=max)
            {
                System.out.println("stack overflow");
                return false;
            }
            else
            {
                a[++top] = x;
                return true;
            }
        }
        public char pop()
        {
                char x = a[top--];
                return x;
        }
        public char peek()
        {
        return a[top];
        }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to check: ");
        String givStr = sc.nextLine();
       isBalanced(givStr);
    }
    static void isBalanced(String str){
        Q4 stack = new Q4(); 
        boolean flag = true;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='(' ||c=='{' || c=='['){
                stack.push(c);
                continue;
            }
            if(stack.isEmpty()){
                flag = false;
            }
            switch (c) 
            {   case ')':
                    char x = stack.pop();
                    if (x == '{' || x == '[')
                        flag = false;
                    break;
                case '}':
                    char y = stack.pop();
                    if (y == '(' || y == '[')
                        flag = false;
                    break;
                case ']':
                    char z = stack.pop();
                    if (z == '(' || z == '{')
                        flag = false;
                    break;
        }}
        if (flag){
            System.out.println("balanced");
        }
        else{
            System.out.println("not balanced");
        }
    }
}