import java.util.*;
public class circulararray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt();
        System.out.println("Enter K:");
        int k=sc.nextInt();
        System.out.println("Enter Q:");
        int q=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter A:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int[] queries=new int[n];
        System.out.println("Enter Queries:");
        for(int i=0;i<q;i++)
        {
            queries[i]=sc.nextInt();
        }

for(int l=1;l<=k;l++)
    {
    int[] a_new = new int[n];
    for(int i=0;i<n;i++)
    {
        int temp=n-1;
        if(i!=temp)
        {
            a_new[i+1]=a[i];
        }
        else
        {
            a_new[0]=a[i];
        }
    }
    a=a_new;
    }
    for(int res=0;res<q;res++)
    {
        int temp2=queries[res];
        System.out.println(a[temp2]);
    }

    }
    
}
