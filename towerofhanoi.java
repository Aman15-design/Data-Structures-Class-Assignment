import java.util.*;
public class towerofhanoi
{
    static void towerofhanoi(int n, char S,char D,char A)
    {
      if(n==1)
      {
          System.out.println("Move disc "+n+" from "+S+" to "+D);
          return;
      }
      towerofhanoi(n-1, S, A, D);
      System.out.println("Move Disk "+n+" from "+S+" to "+D);
      towerofhanoi(n-1, A, D, S);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Discs");
        int n=sc.nextInt();
        towerofhanoi(n,'A','B','C');

    }
}