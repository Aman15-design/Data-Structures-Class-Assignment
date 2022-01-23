import java.util.Scanner;
class prims{
    int minKey(int key[], Boolean mstSet[], int n) 
    { 
        int min = Integer.MAX_VALUE, min_index = -1; 
  
        for (int v = 0; v < n; v++) 
            if (mstSet[v] == false && key[v] < min) { 
                min = key[v]; 
                min_index = v; 
            } 
  
        return min_index; 
    }
    void printMST(int a[], int arr[][],int n) 
    { 
        int t=0;
        System.out.println("Edge \tWeight"); 
        for (int i = 1; i < n; i++)
        {
            System.out.println(a[i] + " - " + i + "\t" + arr[i][a[i]]); 
            t=t+arr[i][a[i]];
        }
        System.out.println("Total weight: "+t);
    } 
    void prims_(int arr[][], int n)
    {
        int a[]=new int[n];
        int b[]=new int[n];
        Boolean mstSet[] = new Boolean[n]; 
        for (int i = 0; i < n; i++) { 
            b[i] = Integer.MAX_VALUE;
            System.out.println(b[i]); 
            mstSet[i] = false; 
        }
        b[0] = 0; 
        a[0] = -1;  
        for (int count = 0; count < n - 1; count++) { 
            int u = minKey(b, mstSet,n); 
            mstSet[u] = true; 
            for (int v = 0; v < n; v++) 
                if (arr[u][v] != 0 && mstSet[v] == false && arr[u][v] < b[v]) { 
                    a[v] = u; 
                    b[v] = arr[u][v]; 
                } 
                
        }
        printMST(a, arr,n); k 
    }
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    

    System.out.println("Enter the elements you want to enter in your graph: ");
    int n =sc.nextInt();
    int[][] arr = new int[n][n];

    boolean flag = false;

    for(int i = 0; i < n; i++ ){  
        i++;
        System.out.println("For Vertex "+i);
        i--;
        for(int j = 0; j < n; j++){
            i++;
            j++; 
             System.out.println(i+"------"+j);
            i--;
            j--;
              arr[i][j] = sc.nextInt();
              }
        }

        for(int i = 0; i < arr.length; i++ ){  
            i++;
            System.out.print(i+" ");
            i--;
        }
    System.out.println("Array elements are: ");
        prims obj=new prims();
    for(int i = 0; i < arr.length; i++ ){  
        System.out.print(i+" ");
        for(int j = 0; j < arr[i].length; j++){  
              System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }

          System.out.println();
      
      obj.prims_(arr,n);
  }
}

