import java.util.*;
public class Longest_Pali
{
	public static String d="";
	public static void Pali(String s1)
	{
		int flag=0;
		if(s1.length()>1)
		{
		for(int i=0;i<s1.length()/2;i++)
		{
			if(s1.charAt(i) != s1.charAt(s1.length()-1-i))
				flag =1;
		}
		}
		else
			flag = 1;
		
		if(flag !=1 )
		{
			if(s1.length()>d.length())
				d=s1;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		for(int i=0;i<s1.length()-1;i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				String s = s1.substring(i,j+1);
				//System.out.println(s);
				Pali(s);
			}
		}
		System.out.println(d);
	}
}