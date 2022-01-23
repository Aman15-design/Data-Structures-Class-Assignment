import java.util.*;
public class palindrome 
{
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
        String check1;
        String check2;
        for(int i=0;i<=n/2;i++)
        {   
           check1=arr[i];
           check2=arr[n-i-1];
    

           if(check1.equals(check2)==false)
           {
            flag=false;
           }
        } 
        if(flag==true)
        {
            System.out.println("It is a Palindrome");
        }
        else
        System.out.println("It is a not Palindrome");
    }
}
