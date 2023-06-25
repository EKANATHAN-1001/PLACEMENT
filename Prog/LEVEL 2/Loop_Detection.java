// Loop Detection using  
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

public class Loop_Detection 
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
	
	public void findLoop()
	{
		t = head.next;
		ArrayList<String> ll = new ArrayList<String>();
		while(t!=null)
		{
			if (!ll.contains(String.valueOf(t.next)))
				ll.add(String.valueOf(t.next));
			else
			{
				System.out.println("\nThe loop starts from "+t.next.data);
				break;
			}
			t=t.next;
		}
	}
	public void loop(int y)
	{
		Node temp = new Node();
		t = head.next;
		while(t.next!=null)
		{
			//System.out.println(" "+t+" "+y+" "+t.next.data);
			if(y == t.next.data)
			{
				temp.next = t.next;
			}
			t = t.next;
		}
		//System.out.println("t " +t.next);
		t.next = temp.next;
		//System.out.println(t.next+" "+temp.next);
		System.out.println("\ndisplay");
		display();
	}
	public void display()
	{
	t = head.next;
	int d=0;
	while(t!=null)
	{
		System.out.print(t.data+" ");
		t = t.next;
		d++;
		if(d==20)
			break;
	}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Loop_Detection  obj = new Loop_Detection();
	for(int i=0;i<6;i++)
		obj.insert();
	obj.display();
	//System.out.println("sdifj");
	obj.loop(9);
	obj.findLoop();
	}
}