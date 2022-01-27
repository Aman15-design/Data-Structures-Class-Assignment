import java.util.*;
class selectionsort {
    static void selectionsort_(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
        {
            int j = i; 
            for (int x = i+1; x < n; x++) 
            {
                if (arr[x] < arr[j]) 
                   j = x; 
            }
            int temp = arr[j]; 
            arr[j] = arr[i]; 
            arr[i] = temp; 
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
    selectionsort_(arr);
    System.out.println("\nSorted Array:");
    for (int i=0; i<n; ++i) 
    {
    System.out.print(arr[i]+" ");
    }
}
}
