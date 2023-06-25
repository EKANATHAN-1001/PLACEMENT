import java.util.*;
public class miss_num
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
		Arrays.sort(arr);
		int n = arr[a-1],k=0,b;
		if(arr[0]>0)
			b=1;
		else
			b = arr[0];
		System.out.println("\nMissing Element");
		// Missing ELEMENT
		for(int i=b;i<=n;i++)
		{
			if(arr[k]==i)
				k++;
			else
			{
				if(i>0)
					System.out.print(i+ " ");
			}
			
		}
		System.out.println("\nLeast Missing Element");
		k=0;
		// Least Missing Element
		for(int i=b;i<=n;i++)
		{
			if(arr[k]==i)
				k++;
			else
			{
				if(i>0)
				{
					System.out.print(i+ " ");
					break;
				}
			}
			
		}
	}
}