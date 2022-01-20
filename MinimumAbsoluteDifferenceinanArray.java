import java.util.*;
public class MinimumAbsoluteDifferenceinanArray {

    void merge(int arr[], int l, int m, int r)
	{
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	void sort(int arr[], int l, int r)
	{
		if (l < r) {
			int m = (l + r) / 2;
			sort(arr, l, m);
			sort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}
    static int Difference(int[] arr,int n)
    {
		MinimumAbsoluteDifferenceinanArray ob = new MinimumAbsoluteDifferenceinanArray();
		ob.sort(arr, 0, arr.length - 1);

        int diff=Integer.MAX_VALUE;
        for(int j=0;j<n-1;j++)
        {
                
                if(Math.abs((arr[j] - arr[j+1]) )< diff)
                {
                    diff=Math.abs((arr[j]-arr[j+1]));
                }
        }
        
       return diff;
    }
    
    public static void main(String[] args)
    {
        long min=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of numbers you want in your array:");
        int n=sc.nextInt();
        boolean check=true;
        if(n>=2 && n<=100000)
        {
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            int k=arr[i];
            if(arr[i]<0)
            {
                k=k*-1;
            }
            min=min+k;

            if(arr[i]<-1000000000 || arr[i]>1000000000)
            {
                min=0;
                check=false;
                break;
                
            }
        }
        if(check==true)
        {
        int minimumVal=Difference(arr, n);
        System.out.println(minimumVal);
        }
    }
}
}
