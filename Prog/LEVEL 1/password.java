// User name mus not password, 8 character, No adjacent number, (atleat 1 upper,1 lower,1 digit, 1 special char)

import java.util.*;
public class password
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String l = "aeioubcdfghjklmnpqrstvwxyz";
		String u = "AEIOUBCDFGHJKLMNPQRSTVWXYZ";
		String num = "0123456789";
		String num1 ="9876543210";
		String spl = "~!@#$%^&*(){}[]:<>,.|-=_+";
		String uname = sc.next();
		String pass = sc.next();
		int p=0,flag=0;
		if(pass.contains(uname))
			System.out.println("Try Another password");
		else if(pass.length()<8)
			System.out.println("PassWord Must not < 8 character");
		else{
			for(int i=0;i<pass.length();i++)
			{
				for(int j=0;j<l.length();j++)
				{
					if(pass.charAt(i)==l.charAt(j))
					{
						p++;
						flag =1;
						break;
					}
				}
				if(flag == 1)
					break;
			}
			flag=0;
			for(int i=0;i<pass.length();i++)
			{
				for(int j=0;j<u.length();j++)
				{
					if(pass.charAt(i)==u.charAt(j))
					{
						p++;
						flag =1;
						break;
					}
				}
				if(flag == 1)
					break;
			}
			
			flag=0;
			for(int i=0;i<pass.length();i++)
			{
				for(int j=0;j<num.length();j++)
				{
					if(pass.charAt(i)==num.charAt(j))
					{
						p++;
						flag =1;
						break;
					}
				}
				if(flag == 1)
					break;
			}
			
			flag=0;
			
			for(int i=0;i<pass.length();i++)
			{
				for(int j=0;j<spl.length();j++)
				{
					if(pass.charAt(i)==spl.charAt(j))
					{
						p++;
						flag =1;
						
						break;
					}
				}
				if(flag == 1)
					break;
			}
			
			flag=0;
			int n1=0,n2=0;
			for(int i=0;i<pass.length()-1;i++)
			{
				for(int j=0;j<num1.length()-1;j++)
				{
					if(pass.charAt(i)==num1.charAt(j) && pass.charAt(i+1)==num1.charAt(j+1))
					{
						n1++;
					}
				}
			}
			
			for(int i=0;i<pass.length()-1;i++)
			{
				for(int j=0;j<num.length()-1;j++)
				{
					if(pass.charAt(i)==num.charAt(j) && pass.charAt(i+1)==num.charAt(j+1))
					{
						n2++;
					}
				}
			}
			
			//System.out.println(p);
			if(!(n1>0 || n2>0))
				p++;
			
			//System.out.println(n1+" "+n2);
			System.out.println(p);
			if(p>4)
				System.out.println("Very Strong");
			else if(p>3)
				System.out.println("Strong");
			else if(p>2)
				System.out.println("Meadium");
			else if(p>1)
				System.out.println("Poor");
			else
				System.out.println("Very Poor");
		}
	}
}