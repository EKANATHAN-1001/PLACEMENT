// FIND LARGEST AND SMALLEST OF AN ARRAY in O(N) complexity

import java.util.*;
public class large_small_N
{
	public static void main(String args[])
	{  
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a;i++)
		{
			if(arr[i] > max)
				max = arr[i];
			if(arr[i] < min)
				min = arr[i];
		}
		System.out.println(min+" "+max);
	}
}