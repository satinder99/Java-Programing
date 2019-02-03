//WAP TO CONVERT BINARY TO DECIMAL NUMMBER

import java.util.*; 
class Main
{
   public static void main(String args[])
   { 
      int i,j,a,r=0,q=0;
	double b,c=0;
      Scanner x=new Scanner(System.in);
      System.out.print("Enter a binary number :");
	a=x.nextInt();
	while(a!=0)
	{
                r=a%10;
		
		b=r*Math.pow(2,q);
		q++;
		c=c+b;
		a=a/10;
        }
	System.out.println();
 	System.out.print("The decimal equivalent is :"+(int)c); 
        System.out.println();

   }
}
