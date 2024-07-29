import java.util.*;
import java.io.*;
public class stack{
    static int stack_arr[], top = 0, size;
    static{
    System.out.println("Enter the size of array");
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    stack_arr = new int[size];
    }
    static void push(int data){
        if(top == size)
            System.out.println("Stack overflow");
        else{
            stack_arr[top] = data;
            top++;
        }
    }
    static int pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return -1;
         }
            top--;
            int data = stack_arr[top];
            stack_arr[top] = 0;
            return data;
        
    }
    static void display(){
        for(int i=0;i<top;i++)
            System.out.print(stack_arr[i]+" |");
        System.out.println("");

    }
    static int peak(){
        return stack_arr[top-1];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ch,data;
        while(true){
            System.out.println("1-push 2-pop 3-display 4-peak 5-exit");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the element");
                    push(sc.nextInt());
                    display();
                    break;
                case 2:
                    System.out.println(pop());
                    display();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println(peak());
                    break;
                case 5:
                    return;
            }
        }
    }
}