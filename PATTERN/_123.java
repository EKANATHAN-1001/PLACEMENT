import java.util.*;
public class _123
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int k=1;
		
		System.out.println("\nEKA logic");
		// EKA LOGIC
		for(int i=0;i<a ;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(k);
				k++;
			}
			k--;
			for(int j=0;j<i;j++)
			{
				k--;
				System.out.print(k);
			}
			k=1;
			System.out.println("");
		}
		System.out.println("\n Manush logic");
		// MANUSH LOGIC
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(j);
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
		
	}
}