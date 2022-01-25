import java.util.*;
class quicksort {

    int partition(int arr[],int low,int high) 
    { 
      int pivot=arr[high];
      int i=(low-1);
      System.out.println(i);
      for(int j=low;j<high;j++)
      {
          if(arr[j]<=pivot)
          {
              i++;
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              System.out.println(i);
          }
      }
      int temp=arr[i+1];
      arr[i+1]=arr[high];
      arr[high]=temp;
      return (i+1);
    }
    void quicksort_(int arr[],int low,int high)
    {
        if(low<high)
        {
            int divide=partition(arr,low,high);
            quicksort_(arr, low, divide-1);
            quicksort_(arr, divide+1, high);
        }
    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter how many elements you want to enter in your array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter "+n+" elements  in your array");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("Array you entered:");
    for (int i=0; i<n; ++i) 
    {
    System.out.print(arr[i]+" ");
    }
    quicksort ob=new quicksort();
    ob.quicksort_(arr,0,n-1);

    System.out.println("\nSorted Array:");
    for (int i=0; i<n; ++i) 
    {
    System.out.print(arr[i]+" ");
    }
}
}