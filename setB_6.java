import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class setB_6 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element you want to enter in an array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            i++;
            System.out.println("Enter the number at position "+i);
            i--;
            arr[i]=sc.nextInt();
        }
        int m=0;
        int x=0;
        for(int j=0;j<n;j++)
        {
          if(j+1<n || j+1==n)
          {  
          if(arr[j]==6 && arr[j+1]==6)
          x++;
          else if(arr[j]==6 && arr[j+1]==7)
          {
          x++;
          m=m+1;
        }
        }
    }
         System.out.println("Desired result is: "+x);
         System.out.println("Occurence of 6 followed by 7 is: "+m);
    }
}