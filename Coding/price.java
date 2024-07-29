import java.util.*;
import java.io.*;
public class  price{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int price = 1;
        while(a>0){
            price = price*(a%10);
            a = a/10;
        }
        System.out.println(price);
    }
}