import java.lang.Math.*;

class iterativemergesort {
	static void mergeSort(int arr[], int n)
	{
        for(int i=1;i<n;i=i*2)
		{
            for(int j=0;j<n-1;j=j+2*i)
			{
				int mid = Math.min(j + i - 1, n-1);
				int right = Math.min(j+ 2*i - 1, n-1);
				merge(arr, j, mid, right);
			}
		}
	}
	static void merge(int arr[], int l, int m, int r)
	{
		int i, j, k;
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (i = 0; i < n1; i++)
			L[i] = arr[l + i];
		for (j = 0; j < n2; j++)
			R[j] = arr[m + 1+ j];
		i = 0;
		j = 0;
		k = l;
		while (i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
	
		while (i < n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	static void printArray(int A[], int size)
	{
		int i;
		for (i=0; i < size; i++)
			System.out.printf("%d ", A[i]);
		System.out.printf("\n");
	}
	
	public static void main(String[] args)
	{
		int arr[] = {12, 11, 13, 5, 6, 7};
		int n = arr.length;
	
		System.out.printf("Given array is \n");
		printArray(arr, n);
	
		mergeSort(arr, n);
	
		System.out.printf("\nSorted array is \n");
		printArray(arr, n);
	}
}

