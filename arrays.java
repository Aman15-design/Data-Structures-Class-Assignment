import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("what should be the size of array ? ");
        int count=s.nextInt();
        int[] arr=new int[count];
        System.out.println("Enter elements");
        for (int i = 0; i <count ; i++) 
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Element you entered :");
        for (int i = 0; i <count ; i++) 
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("what elements position do you want?");
        int pos=s.nextInt();
        search(arr,pos);
        System.out.println("enter the element you want insert : ");
        int el = s.nextInt();
        System.out.println("Enter the position where you want to insert :"+el);
        int pos1=s.nextInt();
        insert(el,pos1,arr,count);
        System.out.println("element you want to delete");
        int element=s.nextInt();
        delete(arr,element);
     }
    static  void search(int[] arr,int pos){
        int index=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==pos){
                index = i;
                System.out.println(pos+" is present in the array at "+i+" th index");
                return;

            }

        }
        System.out.println("element is not present");



    }
    static void insert(int element,int pos,int[] arr,int count){
        int index=0;
        if(pos<arr.length){
            if(pos<=count){
                for(int i =count;i>pos;i--){
                    arr[i] = arr[i-1];
                }
                arr[pos] = element;
            }
            else{
                arr[pos] = element;
            }
        }
        else{
            System.out.println("it is not feasible");
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println("arr["+i+"] is "+arr[i]);
        }

   }
   static void delete(int[] arr,int element){
       for (int i = 0; i <arr.length ; i++) {
           if(arr[i]==element){
               for (int j = i; j<arr.length-1 ; j++) {
                   arr[j]=arr[j+1];
               }
               for (int k = 0; k <arr.length ; k++) {
                   System.out.println("arr["+k+"] is "+arr[k]);
               }
               return;
           }
       }
       System.out.println("element not present");

    }


}