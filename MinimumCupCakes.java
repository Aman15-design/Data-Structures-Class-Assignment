import java.util.*;
public class MinimumCupCakes {
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
    static long calculate(int[] arr,int n)
    {
        long result=0;
        int val=0;
        for(int i=n-1;i>=0;i--)
        {

            double temp=arr[i]*(Math.pow(2, val));
            long temp2 = (long) temp;
            result=result+temp2;
            val++;
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number n");
        int n=sc.nextInt();
        int[] arr=new int[n];
        boolean flag=true;
        if(n>=1 && n<=40)
        {
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<1 || arr[i]>1000)
            {
                flag=false;
                break;
            }
        }
        if(flag=true)
        {
            MinimumCupCakes obj=new MinimumCupCakes();
            obj.sort(arr, 0, arr.length-1);
            long result = calculate(arr, n);
            System.out.println(result);
        }
    }
}
    
}
