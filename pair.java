import java.util.*;
public class pair 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of pairs you want:=");
        int c=sc.nextInt();

        
        int arr[][]=new int[c][2];
        int check;
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<2;j++)
            {

              i++;
              j++;
              System.out.println("Enter the "+j+" element of pair "+i);
              i--;
              j--;
              arr[i][j]=sc.nextInt();
            }
          }
        System.out.println();
        System.out.print("Array you entered:-");
        System.out.println();
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<2;j++)
            {
              System.out.print(" "+arr[i][j]+" ");
            }
            System.out.println();
          }
        

        int temp;
        int temp2;
        for(int i=0;i<c;i++)
        {
            if(arr[i][0]>arr[i][1])
            {
              temp=arr[i][0];
              arr[i][0]=arr[i][1];
              arr[i][1]=temp;
            }
          }
        System.out.print("Sorted Array:-");
        System.out.println();
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<2;j++)
            {
              System.out.print(" "+arr[i][j]+" ");
            }
            System.out.println();
          }


    
}
}