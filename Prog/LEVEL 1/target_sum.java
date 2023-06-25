import java.util.*;
public class target_sum
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
		int t = sc.nextInt();
		for(int i=0;i<a-1;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				if(arr[i]+arr[j] == t)
				{
					System.out.println("Target Achieved ");
					return;
				}
			}
			
		}
		System.out.println("Target is not achieved");
	}
}