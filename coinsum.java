import java.util.*;
public class coinsum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a =new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int check=-1;
        for(int k=0;k<n;k++)
        {
            int check2=-1;
          for(int j=0;j<n;j++)
          {
            int temp=Math.abs((a[k]-a[j]));
            if(temp==1 || temp==0)
            {
                check2++;
            }
          }
          if(check2>check)
          {
              check=check2;
          }
        }
        System.out.println(check);
    }
    
}
