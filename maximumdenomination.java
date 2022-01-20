import java.util.*;
public class maximumdenomination {
    static long gcd(long a, long b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static long findGCD(long A[], int n, int max)
    {
       
        long result = 0;
		for (int k=0;k<n;k++)
        {
            if(k!=max)
            {
			if(A[k]!=max)
			{
			result = gcd(result, A[k]);

			if(result == 1)
			{
			return 1;
			}
        }
		    }
		}

		return result;
    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);    
    while(sc.hasNextInt())
    {
        int T=sc.nextInt();
           for(int i=0;i<T;i++)
    {

        int N=sc.nextInt();
        long[] A=new long[N];
        long temp=Long.MIN_VALUE;
        int ind=0;
        for(int k=0;k<N;k++)
        { 
            A[k]=sc.nextLong();
            if(A[k]>temp)
            {
                temp=A[k];
                ind=k;
            }
        }
        long result=findGCD(A, N, ind);
        System.out.print("OUR GCD: "+result+" MAX= "+temp+" IND: "+ind);
        A[ind]=result;
        long res=0;
        for(int j=0;j<N;j++)
        {
            long temp_2=A[j]/result;
            res=res+temp_2;
        }
        System.out.println(res);
        }
    }
    }    
    }
    

