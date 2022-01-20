import java.util.*;
public class nqueens {
    static void printsol(String chess[][], int n)
    {
        int arr[]=new int[n];
        int temp;
        System.out.println();
        for (int i = 0; i < n; i++) {
            temp=i+1;
            System.out.print("\t"+temp);
        }
        System.out.println();
        for(int k=0;k<n;k++)
        {
            if(k==0)
            System.out.print(" --------");

            else
            System.out.print("--------");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            temp=i+1;
            System.out.print(temp);
            for (int j = 0; j < n; j++)
            {
                System.out.print(" " + chess[i][j]
                                 + " ");
                if(chess[i][j]== "\tQ ")
                {
                    arr[i]=j+1;
                }
            }
            if (i!=n-1)
            System.out.println();
            System.out.println();
        }
       
        for(int k=0;k<n;k++)
        {
            System.out.print("--------");
        }
        System.out.print("\n Location : ");
        for(int k=0;k<n;k++)
        {
            temp=k+1;
            System.out.print("\tQ"+temp+" ");
        }
        System.out.println();
        System.out.print("            ");
        for(int k=0;k<n;k++)
        {
            int l=k+1;
            System.out.print("\t( "+l+","+arr[k]+" )");
        }
        System.out.println();
        System.out.println();
    }
    static boolean isSafe(String chess[][], int row, int col,int n)
    {
        int i, j;
  
        for (i = 0; i < col; i++)
            if (chess[row][i] == "\tQ ")
                return false;
  
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (chess[i][j] == "\tQ ")
                return false;

        for (i = row, j = col; j >= 0 && i < n; i++, j--)
            if (chess[i][j] == "\tQ ")
                return false;
  
        return true;
    }
    static boolean solveNQUtil(String chess[][], int col,int n)
    {
        boolean check=false;
        if (col == n)
        {
            printsol(chess,n);
            check= true;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(chess, i, col,n)) {
                chess[i][col] = "\tQ ";
                check=solveNQUtil(chess, col + 1,n);

                chess[i][col] = "\t- ";
            }
        }
        return check;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of queens: ");
        int n=sc.nextInt();
        
        String chess[][]=new String[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                chess[i][j]="\t- ";
            }
        }
        if (solveNQUtil(chess, 0,n) == false) 
        {
        
        }
        else
    
        printsol(chess,n);
    }
}