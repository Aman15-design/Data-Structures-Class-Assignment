import java.util.*;
class bfs {

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
    void BFS(int start, int[][] adj, int v)
    {
         
        // Visited vector to so that
        // a vertex is not visited more than once
        // Initializing the vector to false as no
        // vertex is visited at the beginning
        boolean[] visited = new boolean[v];
        Arrays.fill(visited, false);
        List<Integer> q = new ArrayList<>();
        q.add(start);
 
        // Set source as visited
        visited[start] = true;
 
        int vis;
        while (!q.isEmpty())
        {
            vis = q.get(0);
 
            // Print the current node
            System.out.print(vis + " ");
            q.remove(q.get(0));
 
            // For every adjacent vertex to
            // the current vertex
            for(int i = 0; i < v; i++)
            {
                if (adj[vis][i] == 1 && (!visited[i]))
                {
                     
                    // Push the adjacent node to
                    // the queue
                    q.add(i);
 
                    // Set
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0)
        {
            int n=sc.nextInt();
            int[][] arr=new int[n][n];
            for(int i=0;i<n-1;i++)
            {
                int u=sc.nextInt();
                int v=sc.nextInt();
                u=u-1;
                v=v-1;
                arr[u][v]=1;
            } 

            int Q=sc.nextInt();
            while(Q>0)
            {
                int[] arr_new=new int[n];
                bfs obj=new bfs();
                obj.sort(arr_new, 0, arr_new.length-1);
                Q--;
            }
            T--;
        }
}
}