import java.util.*;
import java.io.*;
public class static_block implements Runnable{
    static{
        System.out.println("First Block");
    }
    static{
        System.out.println("Before main");
    }
    public void  run(){
        print();
    }
    static void print(){
        int i =0;
        {
        i = i+1;
        System.out.println("Hello"+i);
        }
    }
    public static void main(String args[]){
        System.out.println("Main function");
        static_block s = new static_block();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        t1.start();
        t2.start();
    }
}