
import java.util.Scanner;

public class LinearSearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int [10];
		int i,n,key;
		boolean found=false;
		System.out.print("Enter Number of Elements: ");
		n=sc.nextInt();
		System.out.println("Enter the Elements:");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println();
		System.out.print("Enter the search Element: ");
		key=sc.nextInt();
	
		for(i=0;i<n;i++)
		{
			if(key==arr[i])
			{
				System.out.println(key+" found at position "+(i+1));
				found=true;
			}
		}
		if(!found)
		{
			System.out.println(key+" not found!");
		}
		
	}
}


