import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.util.*;
class circularqueue {
    int front=-1;
    int rear=-1;
    int[] arr=new int[5];

    void enqueueAtRear(int item)
    {
        // overflow condition
        if(isFull())
            System.out.println("Overflow!! Queue is Full");
        else
        {
            if(front==-1)
                front=0;
            if(rear==arr.length-1)
                rear=0;
            else
                rear=rear+1;
             
            arr[rear]=item;    
            }
    }
    
    int dequeAtfront()
    {
        // underflow
        if(isEmpty()){
            System.out.println("Underflow!! Queue is empty");
            return 0;
        }
        else
        {
            int temp=arr[front];
            if(front==rear)
            {
                front=-1;
                rear=-1;
                return temp;
            }
            front=(front+1)%5;
            return temp;    
        }
    }
    int peekAtFront()
    {
        if(isEmpty())
        {
            System.out.println("Underflow!!.....Queue is empty"); 
            return 0; 
        }
        else
            return arr[front];
    }
    boolean isFull()
    {
        if(front==0 && rear==arr.length-1 || front==rear+1)
            return true;
        else
            return false;
    }
    boolean isEmpty()
    {
        if(front==-1)
            return true;
        else
            return false;
    }
    public static void main(String agrs[])
 {
     Scanner sc=new Scanner(System.in);
    circularqueue queue=new circularqueue();
    System.out.println("Enter 5 elemets:- ");
    for(int i=0;i<5;i++)
    {
        queue.enqueueAtRear(sc.nextInt());
    }
    System.out.println("Element at the front is: "+queue.peekAtFront());
    System.out.println("Element to be deleted is: "+queue.dequeAtfront());
    System.out.println("Element to be deleted is: "+queue.dequeAtfront());
    queue.enqueueAtRear(55);
    System.out.println("Element at the front is: "+queue.peekAtFront());
    System.out.println("Element to be deleted is: "+queue.dequeAtfront());
    System.out.println("Element to be deleted is: "+queue.dequeAtfront());
    System.out.println("Element to be deleted is: "+queue.dequeAtfront());
    System.out.println("Element at the front is: "+queue.peekAtFront());
    System.out.println("Element to be deleted is: "+queue.dequeAtfront());
    System.out.println("Element to be deleted is: "+queue.dequeAtfront());
 }   
}
