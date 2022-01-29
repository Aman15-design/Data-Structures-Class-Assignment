/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int checkval(int k, int[] arr, int n)
    {
        int result=0;
        for(int i=0;i<n;i++)
        {
            int temp=arr[i];
            if(temp%k==0)
            {
                result+=temp/k;
            }
            else
            {
                result+=temp/k+1;
            }
        }
        return result;
    }
  
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine())
        {
            int T=sc.nextInt();
            for(int i=1;i<=T;i++)
            {
                    int N=sc.nextInt();
                    int K=sc.nextInt();
                    int[] temp=new int[33];
                    int[] A=new int[N];
                    for(int j=0;j<N;j++)
                    {
                        A[j]=sc.nextInt();
                        int id = 0;
                        int num=A[j];
                        while (num > 0) {
                            temp[id]=temp[id]+num%2;
                            num=num/2;
                            id++;
                    }
                    }
                   int f_res=checkval(K,temp,33);
                   System.out.println(f_res);
                }
        }
	}
}

