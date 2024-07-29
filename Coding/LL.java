import java.util.*;
import java.io.*;
class Node{
    int data;
    Node next;
    Node(){
        this.data  = -1;
        this.next = null;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head,temp;
    LinkedList(){
        head = new Node();
    }

    void insert(int data){
        Node new_node = new Node(data);
        temp = head;
        while(temp.next!=null)
            temp = temp.next;
        temp.next = new_node;
        display();
    }

    void delete(int data){
        temp = head;
        while(temp.next!=null){
            if(temp.next.data == data){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        display();
    }

    void reverse(){
        temp = head;
        System.out.println("By Recursion");
        reverse_rec(temp);
        System.out.println("");
        System.out.println("By Iteration");
        reverse_itr();
        System.out.println("");
    }
    void reverse_rec(Node t){
        if(t == null)
            return;
        reverse_rec(t.next);
        System.out.print(t.data+"-->");
    }
    void reverse_itr(){
        Node prev = null;
        Node current = temp.next;
        Node next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            
            prev = current;
            current = next;
        }
        // we are worked with address so all are collapsed.
        temp = head; // head has only -1(dummy)
        temp.next = prev; 
        head = temp; // now head has entire node with -1 as dummy 
        while(prev!=null){
            System.out.print(prev.data+"-->");
            prev = prev.next;
        }
    }

    void search(int data){
        temp = head;
        while(temp!=null){
            if(temp.data == data){
                System.out.println("Found at "+temp.toString());
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not Found");
    }

    void sort(){
        temp = head.next;
        Node t;
        for(;temp.next!=null;temp=temp.next){
            for(t=temp.next;t!=null;t=t.next){
                if(temp.data > t.data){
                    int t1 = temp.data;
                    temp.data = t.data;
                    t.data = t1;
                }
            }
        }
        display();  
    }

    void display(){
        temp = head.next;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("");
    }
}
public class LL{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int data,ch;
        while(true){
            System.out.println("1-insert 2-delete 3-reverse 4-display 5-sort 6-exit");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the data to be inserted");
                    data = sc.nextInt();
                    ll.insert(data);
                    break;
                case 2:
                    System.out.println("Enter the delement to be deleted");
                    data = sc.nextInt();
                    ll.delete(data);
                    break;
                case 3:
                    System.out.println("The Reversed Element");
                    ll.reverse();
                    break;
                case 4:
                    ll.display();
                    break;
                case 5:
                    ll.sort();
                    break;
                case 6:
                    return;
            }
        }
    }
}