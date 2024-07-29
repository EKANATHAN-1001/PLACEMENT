import java.util.*;
import java.io.*;
public class x_pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int k1 = 0, k2 = n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j && (i+j)==n-1)
                    k2--;
                if(i==j){
                    System.out.print(str.charAt(k1));
                    k1++;
                }
               else if((i+j)==n-1){
                    System.out.print(str.charAt(k2));
                    k2--;
                }
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}