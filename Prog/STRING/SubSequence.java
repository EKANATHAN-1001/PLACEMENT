import java.util.*;
public class SubSequence
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int i=0;
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i) == s2.charAt(j))
					i++;
			}
			//System.out.println(i);
			if(i== s1.length())
				System.out.println("It is SubSequence");
			else
				System.out.println("It is Not a SubSequence");
	}
}