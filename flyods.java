
import java.util.Scanner;
public class Fib
{
	static int fib(int x)
	{
		if(x==1)
			return 15;
		if(x==2)
			return 23;
		else
			return fib(x-1)+fib(x-2);
	}
	
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("The next 3 terms of the series 15,23,38,61 is: ");
		for(int i=1;i<=7;i++)
			System.out.print(fib(i)+" ");
	}
}
