//WAP TO FIND SUM OF DIGITS
import java.util.*;
class Main
{
	public static void main(String args[])
	{
		int a,r=0,b=0;
		Scanner x=new Scanner(System.in);
		//Taking Input
		System.out.print("Enter a number : ");
		a=x.nextInt();
		
		while(a!=0)
		{
			r=a%10;
			b=b+r;
			a=a/10;
		}
		System.out.println();
		//Printing Output as Sum of Numbers
		System.out.print("The sum of digits is : "+b);
		System.out.println();
	}
}

