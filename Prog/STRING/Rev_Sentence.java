import java.util.*;
public class Rev_Sentence
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = "",s1 ="";
		for(int i=0;i<a.length();i++)
		{
			s1 = s1+a.charAt(i);
			if(a.charAt(i)==' ')
			{
				b = s1+b;
				s1 = "";
			}
			else if(i==a.length()-1)
			{
				b = s1+" "+b;
				s1="";
			}
		}
		System.out.println(b);
	}
}