import java.util.*;
public class insertionex{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
     int check=0; 
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
}
