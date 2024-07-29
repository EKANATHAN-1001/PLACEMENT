import java.util.*;
import java.io.*;
public class keywordidentifier{
    public static void main(String args[]){
     String[] arr ={"break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map", "range", "return",
"struct", "type", "var"};
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(str)){
                System.out.println(str+" is a keyword");
                return;
                }
        }
        System.out.println(str+" is not a keyword");
    }
}