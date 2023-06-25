import java.util.*;
public class star
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("\nEKA LOGIC");
		// EKA LOGIC
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("\nManush Logic");
		// Manush Logic
		int n1=0,n2=0,n3=0;
		
		while(n1!=a)
		{
			if(n3<=n2)
			{
				System.out.print("*");
				n3++;
			}
			else
			{
				n1++;
				n2++;
				n3=0;
				System.out.println("");
			}
		}
		
		
	}
}