
import java.util.Scanner;
public class MaxMin 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int [10];
		int i,n;
		System.out.print("Enter Number of Elements: ");
		n=sc.nextInt();
		System.out.println("Enter the Elements:");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println();
		int min=arr[0],max=arr[n-1];
		
		for(i=0;i<n;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		System.out.println("The minimum of all elements is: "+min);
		System.out.println("The maximum of all elements is: "+max);
	}
}

