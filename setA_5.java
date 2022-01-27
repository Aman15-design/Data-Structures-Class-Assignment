// 19CSU022 Aman Sharma //
//Arrays SET-A Q.5


import java.util.*;

public class setA_5{
    public static void main(String args[])
    {   int num;
        Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter the number of rows");
        int r= sc.nextInt();
        System.out.println("Enter the number of column:");
        int c=sc.nextInt();
        int[][] a=new int[r][c];
for ( int i=0; i<r ;i++)  
{  
    for (int j=0; j<c ; j++)   
    {   System.out.println("Enter the number ");
        num=sc.nextInt();
         if(num>99)
         {
             System.out.println("Plese enter a 2 digit number......");
             j--;
         }
         else
         {
             a[i][j]=num;
             
         }
           
    }  
    System.out.println();
}
    int n[][]= new int[r][c];
    for ( int x=0; x<r ;x++)  
    {  
        for (int j=0; j<c ; j++)   
        { 
           n[x][j]=2*a[x][j];
        }
        System.out.println();
        }
    
        for ( int x=0; x<r ;x++)  
    {  
        for (int j=0; j<c ; j++)   
        { 
           System.out.print(" "); 
           System.out.print(n[x][j]);
        }
        System.out.println();
        }
    }
}
