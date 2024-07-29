import java.util.*;
import java.io.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class binary_search_tree{
    Node root, temp;

    binary_search_tree(int data){
        root = new Node(data);
    }

    void insert_bst(int data){
        insert(root, data);
    }
    Node insert(Node temp,int data){
        if(temp==null){
            temp = new Node(data);
            return temp;
        }
        else if(temp.val > data){
            temp.left = insert(temp.left,data);
        }
        else if(temp.val < data){
            temp.right = insert(temp.right,data);
        }
        return temp;
    }

    void search_bst(int data){
        search(root, data);
    }
    void search(Node temp, int data){
        if(temp!=null){  
        if(temp.val == data){
            System.out.println("Found ");
        }
        else if(temp.val > data){
            search(temp.left,data);
        }
        else{
            search(temp.right,data);
        }
        }else{
            System.out.println("Not Found");
        }
    }

    void display(){
        inorder(root);
    }
    void inorder(Node temp){
        if(temp!=null){
        inorder(temp.left);
        System.out.println(temp.val);
        inorder(temp.right);
        }
    }
}

public class bst {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root element");
        int a = sc.nextInt();
        int ch;
        binary_search_tree bs = new binary_search_tree(a);
        while(true){
            System.out.println("Enter 1-insert 2-search 3-display 4-exit");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the element to be inserted");
                    bs.insert_bst(sc.nextInt());
                    bs.display();
                    break;
                case 2:
                    System.out.println("Enter the element to be search ");
                    bs.search_bst(sc.nextInt());
                    break;
                case 3:
                    bs.display();
                    break;
                case 4:
                    return;
            }
        }
    }
}