//WAP TO FIND REVERSE OF A NUMBER .

import java.util.*;
class Main
{
	public static void main(String args[])
	{
		int a=0,r=0,b=0;
		Scanner x=new Scanner(System.in);
		System.out.print("Enter a number : ");
		a=x.nextInt();
		
		while(a!=0)
		{
			r=a%10;
			b=b*10+r;
			a=a/10;
		}
		System.out.println();
		System.out.print("The reverse of this number is : "+b);
		System.out.println();
	}
}
