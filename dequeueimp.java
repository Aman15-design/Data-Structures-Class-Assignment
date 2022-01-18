import java.util.*;
class dequeueimp
{ 
    int front=-1;
    int rear=-1;
    int arr[]=new int[20];
    int size=arr.length;
    void enqueatfront(int item)
    {
        if(isfull())
        {
            System.out.println("Overlflow!!....Queue is Full");
        }
        if(front==-1)
        {
            front=0;
            rear=0;
        }

        if(front==0)
        {
            front=size-1;
        }
        else
        {
            front=front-1;
        }
        arr[front]=item;
    }
    void enqueueAtRear(int item)
    {
       if(isfull())
       {
           System.out.println("Overlflow!!....Queue is Full");
       }
       if(front == -1 )
            front=0;

        rear=rear+1;
        arr[rear]=item;      
    }
    void deleterear()
    {
        if(isEmpty())
        {
            System.out.println("Underflow!!......Queue is Empty");
        }
        if (front == rear) 
        { 
            front = -1; 
            rear = -1; 
        } 
        else if (rear == 0) 
            rear = size-1; 
        else
            rear = rear-1;
    }
    void deletefront()
    {
        if(isEmpty())
        {
            System.out.println("Underflow!!......Queue is Empty");
        }
        if (front == rear) 
        { 
            front = -1; 
            rear = -1; 
        } 
        else if (front == size-1) 
            front = 0; 
        else
            front = front+1;
    }
    int peekfront()
    {
        if (isEmpty()) 
        { 
            System.out.println("Underflow!!......Queue is Empty");
            return 0 ; 
        }
        return arr[front];
    }
    int peekrear()
    {
        if (isEmpty()) 
        { 
            System.out.println("Underflow!!......Queue is Empty");
            return 0 ; 
        }
        return arr[rear];
    }
    boolean isfull()
    {
        if(front==0 && rear==size-1)
        {
            return true;
        }
        return false;
    }
    boolean isEmpty()
    {
        if(front==0 || front<1)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        dequeueimp pq=new dequeueimp();
        pq.enqueueAtRear(3);
        pq.enqueueAtRear(4);
        pq.enqueueAtRear(15);
        pq.enqueueAtRear(6);
        pq.enqueueAtRear(17);
        pq.enqueatfront(18);
        pq.enqueatfront(19);
        pq.enqueatfront(67);
        pq.enqueatfront(54);
        pq.enqueatfront(29);
        System.out.println("Element at front= "+pq.peekfront());
        System.out.println("Element at rear= "+pq.peekrear());
        pq.deleterear();
        System.out.println("After deleting an Element at rear, now element at rear = "+pq.peekrear());
        pq.deletefront();
        System.out.println("After deleting an Element at front, now element at front = "+pq.peekfront());
        System.out.println("Enter the element to be inserted at front: ");
        int ele=sc.nextInt();
        pq.enqueatfront(ele);
        System.out.println("Element at front= "+pq.peekfront());
        System.out.println("Enter the element to be inserted at rear: ");
        int ele2=sc.nextInt();
        pq.enqueueAtRear(ele2);
        System.out.println("Element at rear = "+pq.peekrear());

        System.out.println("Again after deleting the inserted element, we get front and rear as...........");
        pq.deleterear();
        System.out.println("After deleting an Element at rear, now element at rear = "+pq.peekrear());
        pq.deletefront();
        System.out.println("After deleting an Element at front, now element at front = "+pq.peekfront());


    }
}