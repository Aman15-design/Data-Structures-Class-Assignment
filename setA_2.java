// 19CSU022 Aman Sharma //
//Arrays SET-A Q.2

import java.util.Scanner;

public class setA_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<10;i++)
        { 
            i++;
            System.out.println("Enter the number at position "+i);
            i--;
            arr[i]=sc.nextInt();
        }
        System.out.println(arr.length);
        System.out.print("1.Elements at even index:  ");
        for(int i=0;i<10;i++)
        {
            i++;
            if(i%2!=0)
            {
            System.out.print(arr[i]);
            System.out.print(" ");
            }
        }
        System.out.println();
        System.out.print("2.Odd number in your array:  ");
        for(int i=0;i<10;i++)
        {
            if(arr[i]%2!=0)
            {
            System.out.print(arr[i]);
            System.out.print(" ");
            }
        }
        System.out.println();
        System.out.print("3.Array in reverse order:  ");
        for(int j=9;j>=0;j--)
        {
            System.out.print(arr[j]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("4.First and last elements are:  ");
        System.out.println(arr[0]+" "+arr[9]);
        sc.close();
    }
}