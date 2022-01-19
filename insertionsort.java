import java.util.*;
class insertionsort {
    static void insertionsort_(int arr[]) 
    { 
        int check=0;
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int k = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > k) { 
                arr[j + 1] = arr[j]; 
                j = j - 1;
                check=check+1; 
            } 
            arr[j + 1] = k; 
        }
        System.out.println(check);
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
    insertionsort_(arr);
    System.out.println("\nSorted Array:");
    for (int i=0; i<n; ++i) 
    {
    System.out.print(arr[i]+" ");
    }
}
}
