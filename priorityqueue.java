// 1. Enqueue  2.Dequeue    3.Peek(Highest priority)    4.Overflow       5.Underflow
import java.util.*;
class priorityqueue{
    int front=-1;
    int rear=-1;
    int[] arr=new int[10];
    void enqueueAtRear(int item)
    {
       if(isFull())
       {
           System.out.println("Overlflow!!....Queue is Full");
       }
       if(front == -1)
            front=0;
        rear=rear+1;
        arr[rear]=item;      
    }
    int dequeueAtFront()
    {
        if(isEmpty())
        {
            System.out.println("Underflow!!......Queue is Empty");
            return 0;
        }
        else
        {
            int priority=arr[front];
            int temp=0; //index of highest priority elements would be stored in temp
            while(front!=rear+1)
            {
                if(priority>arr[front])
                {
                    priority=arr[front];
                    temp=front;
                    front=front+1;
                }
                else
                {
                    front=front+1;
                }
            }
           arr[temp]=arr[rear];
           rear=rear-1; 
           front=0;
           return priority;
        }

    }
    int PeekAtFront()
    {
        if(isEmpty())
        {
            System.out.println("Underflow!!......Queue is Empty");
            return 0;
        }
        else
        {
            int priority=arr[front];
            int temp=0; //index of highest priority elements would be stored in temp
            while(front!=rear+1)
            {
                if(priority>arr[front])
                {
                    priority=arr[front];
                    temp=front;
                    front=front+1;
                }
                int x=Integer.MIN_VALUE
                else
                {
                    front=front+1;
                }
            }
            return priority;x
      
        }
   
}
    boolean isFull()
    {
        if(front==0 && rear==arr.length-1)
            return true;
        else
            return false;
    }
    boolean isEmpty()
    {
        if(front==-1 || front==rear+1)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        priorityqueue pq=new priorityqueue();
        pq.enqueueAtRear(3);
        pq.enqueueAtRear(4);
        pq.enqueueAtRear(15);
        pq.enqueueAtRear(6);
        pq.enqueueAtRear(17);
        pq.enqueueAtRear(84);
        pq.enqueueAtRear(69);
        pq.enqueueAtRear(10);
        pq.enqueueAtRear(11);
        pq.enqueueAtRear(12);

        System.out.println("Element with the highest priority= "+pq.dequeueAtFront());
        System.out.println("Element at the peek(2nd highest priority)= "+pq.PeekAtFront());

    }
}