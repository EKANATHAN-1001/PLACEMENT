import java.util.*;
public class Merge_Sort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		System.out.println("Enter the no of element in LL 1");
		int a1 = sc.nextInt();		
		System.out.println("Enter the no of element in LL 2");
		int a2 = sc.nextInt();
		System.out.println("Enter Elements in LL 1");
		for(int i=0;i<a1;i++)	
		{
			int s = sc.nextInt();
			l1.add(s);
		}
		System.out.println("Enter Elements in LL 2");
		for(int i=0;i<a2;i++)	
		{
			int s = sc.nextInt();
			l2.add(s);
		}
		Iterator itr1 = l1.iterator();
		Iterator itr2 = l2.iterator();
		LinkedList<Integer> l3 = new LinkedList<Integer>();
		while(itr1.hasNext())
		{
			l3.add((int)itr1.next());
		}
		while(itr2.hasNext())
		{
			l3.add((int)itr2.next());
		}
		Collections.sort(l3);
		System.out.println(l3);
	}
}