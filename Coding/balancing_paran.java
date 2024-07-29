import java.util.*;
import java.io.*;
public class balancing_paran{
    public static void main(String args[]){
        Stack<Character> s = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression ");
        String str = sc.nextLine();

        String open = "[{(";
        String  close = "}])";
        for(int i=0;i<str.length();i++){
            if(open.contains(String.valueOf(str.charAt(i)))){
                s.push(str.charAt(i));
            }
            else if(close.contains(String.valueOf(str.charAt(i)))){
                if(s.size()!=0){
                char bp = s.pop();
                if(str.charAt(i)==']' && bp == '[')
                    continue;
                else if (str.charAt(i)=='}' && bp == '{')
                    continue;
                else if (str.charAt(i)==')' && bp=='(')
                    continue;
                else{
                    System.out.println("Not Balanced");
                    return;
                }
                }
                else{

                    System.out.println("Not Balanced");
                    return;
                }
            }
        }
        if(s.size()==0)
        System.out.println("Balanced");
        else
        System.out.println("Not balanced");


        
    }
}