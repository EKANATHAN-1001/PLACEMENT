import java.util.*;
public class Rev_Sentence_Space
{
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		String a = sc.nextLine();
		String s1 = "",s2="";
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!= ' ')
				s1 = a.charAt(i)+s1;
		}
		System.out.println(s1);	
			int o=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i) == ' ')
				s2=s2+" ";
			else
			{
				s2 = s2+s1.charAt(o);
				o++;
			}
		}
		System.out.println(s2);
	}
}