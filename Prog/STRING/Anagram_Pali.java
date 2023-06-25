import java.util.*;
public class Anagram_Pali
{
	public static void Pali(String s1)
	{
		int flag=0;
		System.out.println("ANAGRAM "+s1);
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
			System.out.println("Pali "+s1);
		}
	}
	public static void get_AnaGram(String s,int start,int end)
	{ 
        if (start == end) 
            Pali(s); 
        else { 
            for (int i = start; i <= end; i++) { 
                s = swap(s, start, i); 
                get_AnaGram(s, start + 1, end); 
                s = swap(s, start, i); 
            } 
        } 
    } 
    public static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i]; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s2 = sc.nextLine();
		for(int l=0;l<s2.length();l++)
		{
		for(int i=0;i<s2.length()-1;i++)
		{
			for(int j=i+1;j<s2.length();j++)
			{
				String s = s2.substring(i,j+1);
				System.out.println("SubString "+s);
				get_AnaGram(s,0,s.length()-1);
				
			}
		}
		}
	}
}