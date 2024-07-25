
import java.util.Scanner;
public class BinarySearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int [10];
		int i,n,key;
		boolean found=false;
		System.out.print("Enter Number of Elements: ");
		n=sc.nextInt();
		System.out.println("Enter the Elements in ascending order:");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println();
		System.out.print("Enter the search Element: ");
		key=sc.nextInt();
	
		int low=0,high=n-1,mid;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(arr[mid]==key)
			{
				found=true;
				System.out.println("The search element "+key+" is found at position: "+(mid+1));
				break;
			}
			else if(arr[mid]>key)
			{
				high=mid-1;
			}
			else if(arr[mid]<key)
			{
				low=mid+1;
			}
		}
		if(!found)
		{
			System.out.println("The search element "+key+" is not found ");
		}
	}
}

