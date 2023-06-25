import java.util.*;
public class odd_even_star
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("\nOdd Star");
		// ODD STAR
		for(int i=0;i<a;i++)
		{
			if(i%2==0)
			{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
			}
		}
		
		
		System.out.println("\nEven Star");
		// EVEN STAR
		for(int i=0;i<a;i++)
		{
			if(i%2!=0)
			{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
			}
		}
		
	}
}