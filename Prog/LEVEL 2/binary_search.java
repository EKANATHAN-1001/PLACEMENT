import java.util.*;
public class binary_search
{
	public static int binary_search_func(int low,int high,int arr[],int x)	
	{
		if(high >= low && low <= arr.length - 1)
		{
		int mid = low + (high-low)/2;
		if(arr[mid]==x)
		{
			return mid;
		}
		else if(arr[mid] > x)
		{
			high = mid-1;
			return binary_search_func(low,high,arr,x);
		}
		else if(arr[mid]<x)
		{
			low = mid+1;
			return binary_search_func(low,high,arr,x);
		}
		
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		int low=0,high=a-1;
		binary_search b = new binary_search();
		System.out.println("Value found at "+(1+b.binary_search_func(low,high,arr,x)));
		
	}
}