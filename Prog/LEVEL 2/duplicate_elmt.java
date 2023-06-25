// Print Duplicate Element in an array

import java.util.*;
public class duplicate_elmt
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		for(int i=0;i<a;i++)
			arr[i] = sc.nextInt();
		for(int i=0;i<a-1;i++)
		{
			int count=0;
			for(int j=i+1;j<a;j++)
			{
				if(arr[j] == arr[i])
					count++;
			}
			if(count!=0)
				System.out.print(arr[i]+" ");
			count =0;
		}
	}
}