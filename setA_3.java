// 19CSU022 Aman Sharma //
//Arrays SET-A Q.3

import java.util.Scanner;

public class setA_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[5];
        int sum=0;
        int altsum=0;
        int altsum2=0;
        for(int i=0;i<5;i++)
        { 
            i++;
            System.out.println("Enter the number at position "+i);
            i--;
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
            if(i%2==0)
            {
             altsum=altsum+arr[i];
            }
            else
            {
                altsum2=altsum2+arr[i];
            }

        }
        System.out.println("1. Sum of elements:  "+sum);
        System.out.println("2. Sum of alternate elements: "+altsum + " and "+altsum2);
        int temp;
        
        for (int i = 0; i < 5; i++) 
        {
            for (int j = i + 1; j < 5; j++) 
            {
                if (arr[i] < arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<5;i++)
        {
            if(arr[i]>arr[i+1])
            {
            System.out.println("3. Second largest element: "+arr[i+1]);
            break;
            }
            
        }
    }
}
        