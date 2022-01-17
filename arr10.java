import java.util.*;

import java.util.*;
public class arr10 {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of words you want to enter in an array");
        int n= sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {   
            i++;
            System.out.println("Enter the number at position "+i);
            i--;
            arr[i]=sc.next();  
        }
        boolean flag=true;
        for(int j=0;j<=n/2;j++)
        {
            String a=arr[j];
            String b=arr[n-j-1];
            if(a.equals(b)==false)
            {
                flag=false;
            }
        }
        if(flag==true)
        {
            System.out.println("Yes, it is a palindrome");
        } 
        else
        {
            System.out.println("Nope, it is not a palindrome");
        }
    }
}
