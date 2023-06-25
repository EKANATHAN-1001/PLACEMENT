import java.util.*;
public class Min_OP_Make_Pali

{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int c=0;
		for(int i=0;i<a.length()/2;i++)
		{
			if(a.charAt(i)==a.charAt(a.length()-1-i))
				continue;
			else
			{
				a=a+a.charAt(i);
				c++;
			}
		}
		System.out.println(c);
	}
}