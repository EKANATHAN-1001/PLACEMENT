import java.util.*;
import java.io.*;
public class greater_of_prev{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b,count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a;i++){
            b = sc.nextInt();
            if(b > max){
                count++;
                max=b;
            }
        }
        System.out.println(count);
        
    }
}