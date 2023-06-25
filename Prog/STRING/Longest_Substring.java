// LONGEST SUBSTRING WITHOUT ANY REPITATION OF CHARACTER
// ip = geeksforgeeks, op = eksforg 

import java.util.*;
public class Longest_Substring
{
	public static String s = "";
	public static boolean fn(String s1,char o)
	{
	
		//System.out.println(s1+ " "+o);
		for(int i=0;i<s1.length();i++)
			if(o==s1.charAt(i))
			{
				s="";
				return true;
			}
			//System.out.println("S = " +s);
			return false;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = "";
		for(int i=0;i<s1.length()-1;i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				s="";
				if(s1.charAt(j-1)!=s1.charAt(j))
				{
					s = s1.substring(i,j+1);
					if (fn(s,s1.charAt(j)))
						break;
				}
				else 
					break;
				if (s.length() > s2.length())
					s2 = s;
			}
		}
		
			System.out.println(s2);
	}
}