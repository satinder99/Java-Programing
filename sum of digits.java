//WAP TO FIND SUM OF DIGITS
import java.util.*;
class Main
{
	public static void main(String args[])
	{
		int a,r=0,b=0;
		Scanner x=new Scanner(System.in);
		System.out.print("Enetr a number : ");
		a=x.nextInt();
		
		while(a!=0)
		{
			r=a%10;
			b=b+r;
			a=a/10;
		}
		System.out.println();
		System.out.print("The sum of digits is : "+b);
		System.out.println();
	}
}
