//WAP TO CONVERT DECIMAL NUMBER INTO BINARY NUMBER

import java.util.*;
class Main
{
   public static void main(String args[])
   { 
       int a,r=0,b=0,z=0,i,c=0;
       Scanner x=new Scanner(System.in);
       System.out.print("Enter a decimal number :");
        a=x.nextInt();
	System.out.println();
	
	while(a!=0)
	{
		r=a%2;
		b=b*10+r;
		a=a/2;
		z++;
        }

	for(i=0;i<z;i++)
	{
		r=b%10;
		c=c*10+r;
		b=b/10;
	}
	System.out.print("The Binary equivalent is : "+c);
	System.out.println();

   }
}
