import java.util.*;
public class x
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				if(i==j || i+j == a-1)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}