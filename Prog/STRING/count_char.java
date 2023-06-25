import java.util.*;
public class count_char
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String	s = sc.nextLine();
		String s1[] = s.split("");
		int c=1,i;
		Arrays.sort(s1);
		s="";
		for(i=0;i<s1.length;i++)
			s = s+s1[i];
		s = s.trim();
		System.out.println(s);
		String s2 ="";
		for(i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i) == s.charAt(i+1))
				c++;
			else
			{
				s2 = s2+s.charAt(i)+String.valueOf(c);
				c=1;
			}
		}
		s2 = s2+s.charAt(i)+String.valueOf(c);
		System.out.println(s2);
		
	}
}