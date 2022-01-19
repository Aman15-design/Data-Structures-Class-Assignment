// 19CSU022 Aman Sharma //
//Arrays SET-A Q.4

import java.util.*;
public class frequency {
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
        System.out.println("Enter the number whose frequenxy you want to check: ");
        int num=sc.nextInt();
        int check=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==num)
            {
             check++;
            }
        }
        System.out.println("Frequency of the number "+num +" is:" +check);
    }
}