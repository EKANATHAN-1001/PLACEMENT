// Simple LL implementation contains insert, count Elmt, display, delete, reverse display in JAVA

import java.util.*;
class Node
{
	public int data;
	public Node next;
	Node()
	{
		this.data = -1;
		this.next = null;
	}
	Node(int Data)
	{
		this.data = Data;
		this.next = null;
	}
}
public class LL 
{
	public Scanner sc = new Scanner(System.in);
	Node head = new Node();
	Node t = head;
	public void insert()
	{
			System.out.println("Enter a NUmber");
			int x = sc.nextInt();
			Node temp = new Node(x);
			t.next = temp;
			t = t.next;
	}
	
	public void printReverse(Node p)
	{
		if(p == null)
			return;
		printReverse(p.next);
		System.out.print(p.data+" ");
	}
	
	public void  reverse()
	{
		t = head.next;
		printReverse(t);
	}
	
	public void countElmt(int a)
	{
		int count = 0;
		t = head.next;
		while(t!=null)
		{
			if(a == t.data)
				count++;
			t=t.next;
		}
		System.out.println("\n"+count +" times "+ a +" is present");
	}
	
	public void display()
	{
	t = head.next;
	while(t!=null)
	{
		System.out.print(t.data+" ");
		t = t.next;
	}
	}
	
	public void delete(int a)
	{
		t = head.next;
		try{
		while(t!=null)
		{
			if(t.next.data == a)
			{
				t.next = t.next.next;
				break;
			}
			t = t.next;
		}
		}
		catch(Exception e)
		{
			System.out.println("\nNot Found Element");
		}
		display();
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		LL  obj = new LL();
	for(int i=0;i<4;i++)
		obj.insert();
	obj.display();
	System.out.println("\nEnter the number to be counted");
	int g = sc.nextInt();
	obj.countElmt(g);
	System.out.println("\nEnter the Element to be search and deleted");
	g = sc.nextInt();
	obj.delete(g);
	System.out.println("\nReverse in LL");
	obj.reverse();
	}
}