import java.util.*;
import java.io.*;
public class amstrong{
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        int sum =0,rem=0;
        int n = a;
        while(n>0){
            rem = n%10;
            sum = sum + (rem*rem*rem);
            n=n/10;
        }
        if(a==sum){
            System.out.println("Amstrong number ");
        }
        else {
            System.out.println("Not Amstrong number");
        }
    }
}