import java.util.*;
public class pali
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		LinkedList<Character> ll = new LinkedList<Character>(); 
		for(int i=0;i<a.length();i++)
		{
			ll.add(a.charAt(i));
		}
		String s="";
		Iterator <Character> itr = ll.descendingIterator();
		while(itr.hasNext())
		{
			s = s+itr.next();
		}	
		if(a.equals(s))
			System.out.println("Palindrome");
		else 
			System.out.println("Not Palindrome");
	}
}