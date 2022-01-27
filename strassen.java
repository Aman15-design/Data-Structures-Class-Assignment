import java.util.*;
class strassen{

public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        int n=sc.nextInt();
        int n1=1;
        while(n1<=n)
        {
            n1=n1*2;
        }

        
        System.out.println("For First matrix");
        int[][] arr = new int[n][n];
        for(int i = 0; i < n1; i++ ){  
            for(int j = 0; j < n1; j++){
                if(i<n & j<n)
                {
                i++;
                j++;
                 System.out.println(i+"------"+j);
                i--;
                j--;
                  arr[i][j] = sc.nextInt();
                }
                else
                {
                    arr[i][j]=0;
                }
            
                  }
                  System.out.println("--------------------------");
            }
            System.out.println("For second matrix");
            int[][] arr1 = new int[2][2];
            for(int i = 0; i < n; i++ ){  
                for(int j = 0; j < n; j++)
                {
                    if(i<n & j<n)
                {
                i++;
                j++;
                 System.out.println(i+"------"+j);
                i--;
                j--;
                  arr[i][j] = sc.nextInt();
                }
                else
                {
                    arr[i][j]=0;
                }
            
                  }
                      System.out.println("--------------------------");
                }
                int[][] m=new int[n1][n1];
                System.out.println("Matrix multiplication result");
                for(int i=0;i<2;i++)
                {
                    for(int j=0;j<2;j++)
                    {
                        System.out.print(" "+m[i][j]+" ");
                    }
                    System.out.println();
                }
            
    }

}