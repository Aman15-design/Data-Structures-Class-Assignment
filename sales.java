import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class sales
{
   
   double sales[][];
   int s;
   int p;
   double[][] amt;
  
   
   
   public void Sales()
   {
      Scanner sc = new Scanner(System.in);
	  
	  
	  sales = new double[5][4];
	  amt=new double[5][4];
       
		
	

	  for ( p = 0; p < 5; p++)
	  {
		 
		 for ( s = 0; s < 4; s++)
		 {
		   s++;
		   p++;
		   
		   System.out.println("Enter the amount of product "+p+" by sales person "+s);
		   s--;
		   p--;
		 amt[p][s]=sc.nextInt();

		 } 
		 
	
		 
	  }
	 
	  System.out.println("        "+"    S.P1   "+"    S.P2   "+"    S.P3   "+"    S.P4   "+"TOTAL($) (For each product)");
	  System.out.println(" ");
	  
	  for ( p = 0; p < 5; p++)
	  {  
		double num=0;
		
		for (int s = 0; s < 4; s++)
		 {
			if(s==0)
			{   p++;
				System.out.print("Product "+p);
			    p--; 
			}
			if(amt[p][s]>0 && amt[p][s]<10)
			   System.out.print("    "+amt[p][s]+"    ");
			   else if(amt[p][s]>=10 && amt[p][s]<100)
			   System.out.print("    "+amt[p][s]+"   ");
			   
			   else if(amt[p][s]>=100 && amt[p][s]<1000)
			   System.out.print("    "+amt[p][s]+"  ");
			   else 
			   System.out.print("    "+amt[p][s]+" ");
			num=num+amt[p][s];
		} 
		 
		System.out.println(num);
		 
	  }
	  System.out.println(" ");

	  for (int s = 0; s < 4; s++)
	  {  
		double num2=0;
		
		 for ( p = 0; p < 5; p++)
		{
			num2=num2+amt[p][s];
		}
		if(s==0)
		{
		System.out.print("TOTAL($) "); 
		}
		if(num2>0 && num2<10) 
		System.out.print("    "+num2+"    ");
		else if(num2>=10 && num2<100)
		System.out.print("    "+num2+"   ");
		else if(num2>=100 && num2<1000)
		System.out.print("    "+num2+"  ");
		else if(num2>=10000 && num2<10000)
		System.out.print("    "+num2+" ");
		else
		System.out.print("    "+num2+"");

		 
	  }
	 System.out.println();
	 System.out.println("(For each sales person)");
	 System.out.println(" ");
	 System.out.println("S.P=Sales Person");
	 System.out.println(" ");

	
	  
   }
   public static void main( String args[])
   {
      sales mySales = new sales();
	  mySales.Sales();
	  
   }
}