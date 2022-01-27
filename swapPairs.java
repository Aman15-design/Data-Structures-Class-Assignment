import java.util.*;


public class swapPairs {
public void swapPairs(int[] arr)
    {
        int n=arr.length+1;
        int temp=0;
        if(n%2==0)
        {
         for(int i=0;i<n;i=i+2)
         {
             temp=arr[i];
             arr[i]=arr[i+1];
            arr[i+1]=temp;
         }
         System.out.println();
     }
     else
     {
         n=n-1;
         for(int i=0;i<n;i=i+2)
         {
             temp=arr[i];
             arr[i]=arr[i+1];
            arr[i+1]=temp;
         }
         System.out.println();
      n=n+1;
     }

         System.out.println("After swapping:  ");
         
         for(int j=0;j<n;j++)
         
         {
             System.out.print(arr[j]);
             System.out.print(" ");
         }
         
         
        
    }

 

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
       
        System.out.println("Array that you entered: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
      
        
           int temp=0;
           if(n%2==0)
           {
            for(int i=0;i<n;i=i+2)
            {
                temp=arr[i];
                arr[i]=arr[i+1];
               arr[i+1]=temp;
            }
            System.out.println();
        }
        else
        {
            n=n-1;
            for(int i=0;i<n;i=i+2)
            {
                temp=arr[i];
                arr[i]=arr[i+1];
               arr[i+1]=temp;
            }
            System.out.println();
         n=n+1;
        }

            System.out.println("After swapping:  ");
            
            for(int j=0;j<n;j++)
            
            {
                System.out.print(arr[j]);
                System.out.print(" ");
            }
            
            swapPairs swap=new swapPairs();
           
       
        }


        


    }
