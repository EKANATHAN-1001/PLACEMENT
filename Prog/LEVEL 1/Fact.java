import java.util.*;
public class Fact{
	public static int Fact(int y)
	{
		if(y==0 || y==1)
			return 1;
		else 
			return y*Fact(y-1);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		for(int i=0;i<a;i++)
			arr[i] = sc.nextInt();
		for(int i=0;i<a;i++)
		{
			System.out.println("Fact of "+arr[i]+" "+Fact(arr[i]));
		}
	}
}