import java.util.*;
public class nqueen {
    static void printsol(String board[][], int n)
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
                System.out.print(" " + board[i][j]
                                 + " ");
                if(board[i][j]== "\tQ ")
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
    static boolean isSafe(String board[][], int row, int col,int n)
    {
        int i, j;
  
        for (i = 0; i < row; i++)
            if (board[i][col] == "\tQ ")
                return false;
  
        for (i = col, j = row; i >= 0 && j >= 0; i--, j--)
            if (board[j][i] == "\tQ ")
                return false;

        for (i = col, j = row; j >= 0 && i < n; i++, j--)
            if (board[j][i] == "\tQ ")
                return false;
  
        return true;
    }
    static boolean solveNQUtil(String board[][], int row,int n)
    {
        boolean check=false;
        if (row == n)
        {
            printsol(board,n);
            check= true;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(board, i, row,n)) {
                board[row][i] = "\tQ ";
                check=solveNQUtil(board, row + 1,n);

                board[row][i] = "\t- ";
            }
        }
        return check;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of queens: ");
        int n=sc.nextInt();
        
        String board[][]=new String[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]="\t- ";
            }
        }
        if (solveNQUtil(board, 0,n) == false) 
        {
        
        }
        else
        
        printsol(board,n);
    }
}