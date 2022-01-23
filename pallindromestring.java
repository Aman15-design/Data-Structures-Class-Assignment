import java.io.*;
import java.util.*;

public class pallindromestring {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int n=A.length();
        boolean flag=true;
        for(int i=0;i<n/2;i++)
        {
            int temp=A.charAt(i);
            int temp2=A.charAt(n-i-1);
            if(temp==temp2 || Math.abs((temp-temp2))==32)
            {
            }
            else
            {
                flag=false;
                break;
            }
        }
        if(flag=true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}



