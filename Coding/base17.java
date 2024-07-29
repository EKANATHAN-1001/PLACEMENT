import java.util.*;
import java.io.*;
public class base17{

    public static void main(String args[]){
        HashMap <Character,Integer> hm = new HashMap<Character,Integer>();
        hm.put('A',10);
        hm.put('B',11);hm.put('C',12);
        hm.put('D',13);hm.put('E',14);
        hm.put('F',15);hm.put('G',16);
        int sum = 0;int val =0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i)))
            sum = sum + (Integer.parseInt(String.valueOf(str.charAt(i))))*(int)Math.pow(17,(str.length()-1-i));
            else
            val = hm.get(str.charAt(i));
            sum = sum + val * (int)Math.pow(17,(str.length()-1-i));
            
        }
        System.out.println(sum);
    }
}