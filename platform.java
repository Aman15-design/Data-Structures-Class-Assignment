
import java.util.*;

class platform {
	public static int minplatform(int arr[], int dep[],
								int n)
	{
		int platform = 1, result = 1;
		int i = 1, j = 0;
		for (i = 0; i < n; i++) {
			platform = 1;

			for (j = i + 1; j < n; j++) {
				if ((arr[i] >= arr[j] && arr[i] <= dep[j])
					|| (arr[j] >= arr[i]
						&& arr[j] <= dep[i]))
					platform++;
			}
			result = Math.max(result, platform);
		}

		return result;
	}
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of trains you wanted to add");
		int n = sc.nextInt();
        int arr[]=new int[n];
        int dep[]=new int[n];
        for(int i=0;i<n;i++)
        {
            i++;
            System.out.println("Enter arriaval time for train "+i+": ");
            i--;
            arr[i]=sc.nextInt();
            i++;
            System.out.println("Enter departure time for train "+i+": ");
            i--;
            dep[i]=sc.nextInt();
        }
		System.out.println(
			"Minimum Number of Platforms Required = "
			+ minplatform(arr, dep, n));
	}
}
