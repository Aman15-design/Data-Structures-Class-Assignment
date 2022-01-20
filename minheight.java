/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class minheight
{
    public static int calculateMinh(int g,int c)
    {
        int c_2=c*c;
        int res=c_2/(g*2);
        return res;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt())
        {
            int T=sc.nextInt();
               for(int i=0;i<T;i++)
        {
            while(sc.hasNextInt())
            {
            int g=sc.nextInt();
            int c=sc.nextInt();
            
            int result=calculateMinh(g,c);
            System.out.println(result);
            }
        }
        }
	}
}
