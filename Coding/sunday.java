import java.util.*;
import java.io.*;
public class sunday{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HashMap <String,Integer> hm = new HashMap<String,Integer>();
        hm.put("sunday",0);hm.put("monday",1);hm.put("tuesday",2);hm.put("wednessday",3);hm.put("thrusday",4);hm.put("friday",5);hm.put("saturday",6);
        String str = sc.next();
        int a = sc.nextInt();
        if(str.equals("sunday"))
            a = a+1;
        a = a + hm.get(str);
        System.out.println(a/7);
    }
}