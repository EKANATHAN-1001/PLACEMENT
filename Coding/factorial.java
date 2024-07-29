import java.util.*;
import java.io.*;
public class factorial{
    public static int fact(int a){
        if(a<=1)
            return 1;
        return a*fact(a-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fact(a));
    }
}