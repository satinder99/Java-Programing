//WAP TO FIND SUM OF FIRST N NUMBERS OF FIBONANCI SERRIES USING DO-WHILE LOOP
import java.util.*;
class Main
{
	public static void main(String args[])
	{
		int a,b,c=0,d,i=0;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter 1st two numbers of yous fibonacci series : ");
		a=x.nextInt();
		b=x.nextInt();
		
		System.out.print("Enter number of terms in serries : ");
		d=x.nextInt();
		
		System.out.println();
		System.out.println("Your series is as follow : ");
		System.out.print("         "+a+" , "+b);
		do
		{	c=a+b;
			
			System.out.print(" , "+c);
			a=b;
			b=c;

			i++;//counter
		}while(i<(d-2));
		System.out.println();
	}
}
