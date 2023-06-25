// Print Unique Element in an array

import java.util.*;
public class unique_elmt
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
		
		
		for(int i=0;i<a-1;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				if(arr[i]==arr[j])
					arr[j] = -1;
			}
		}
		
		
		for(int i=0;i<a;i++)
		{
			if(arr[i] != -1)
			System.out.print(arr[i]+" ");
		}
	}
}