import java.util.*;
import java.io.*;
class Node{
    int data;
    Node next;
    Node(){
        this.data = -1;
        this.next = null;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Q{
    Node head,temp;
    Q(){
        head = new Node();
    }
    void enqueue(int data){
        temp = head;
        while(temp.next!=null)
            temp = temp.next;
        temp.next = new Node(data);
    }
    void dequeue(){
        temp = head.next;
        if(temp!=null){
            System.out.print("Deleted data "+temp.data);
            head = temp;
        }
        System.out.println("");
    }
    void peak(){
        temp = head.next;
        if(temp!=null)
            System.out.println("Peak elemennt "+temp.data);
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

public  class queue{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Q q = new Q();
        int ch;
        while(true){
            System.out.println("Enter 1-enqueue 2-dequeue 3-display 4-peak 5-exit");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the element");
                    q.enqueue(sc.nextInt()); 
                    q.display();
                    break;
                case 2:
                    q.dequeue();
                    q.display();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    q.peak();
                    break;
                case 5:
                    return;
            }
        }
    }
}