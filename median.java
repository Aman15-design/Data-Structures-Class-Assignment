import java.util.*;
public class median {
    static double median(int[] arr,int n)
    {
       int x=arr.length; 
       int temp=0;
       int check;
       for(int i=0;i<n;i++)
       {   
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }   
        
        }
       System.out.println();
       System.out.print("Sorted array:-  ");
       for(int i=0;i<n;i++ )
       {
        System.out.print(" "+arr[i]+" ");
       }
       double median;
       if(n%2==0)
       {   int d=(n/2)+1; 
           d=d-2;
           median=(arr[n/2]+arr[d])/2;
       }
       else
       {
           check=n+1;
           check=check-1;
           median=arr[check/2];
       }
       System.out.println();
       return median;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element you want to enter in an array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        int check;
        for(int i=0;i<n;i++)
        {
            i++;
            System.out.println("Enter the number at position "+i);
            i--;
            check=sc.nextInt();
            if(check>0&&check<100)
            {
                arr[i]=check;
            }
            else
            {
                System.out.println("Please enter a number less than 100.........! ");
                i=i-1;
            }
           
        }
        System.out.println();
        System.out.print("Array that you entered:  ");
        for(int i=0;i<n;i++)
        {
           System.out.print(" "+arr[i]+" ");
           
        }
        
        System.out.println("Median of given array is: "+median(arr,n));

    }
}