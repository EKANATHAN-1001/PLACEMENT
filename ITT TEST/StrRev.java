
import java.util.*;
public class StrRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s1 = sc.nextLine();
        String s2="";
        String s3 = "";
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=' ' && s1.charAt(i)!='!' && s1.charAt(i)!=':' && s1.charAt(i)!=';' && s1.charAt(i)!='~' && s1.charAt(i)!='`' && s1.charAt(i)!='@' && s1.charAt(i)!='#' && s1.charAt(i)!='$' && s1.charAt(i)!='%' && s1.charAt(i)!='^' && s1.charAt(i)!='&' && s1.charAt(i)!='*' && s1.charAt(i)!='(' && s1.charAt(i)!=')' && s1.charAt(i)!='[' && s1.charAt(i)!=']')
                s2 = s1.charAt(i)+s2;
        }
        int j=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==' ' || s1.charAt(i)=='!' || s1.charAt(i)==':' || s1.charAt(i)==';' || s1.charAt(i)=='~' || s1.charAt(i)=='`' || s1.charAt(i)=='@' || s1.charAt(i)=='#' || s1.charAt(i)=='$' || s1.charAt(i)=='%' || s1.charAt(i)=='^' || s1.charAt(i)=='&' || s1.charAt(i)=='*' || s1.charAt(i)=='(' || s1.charAt(i)==')' || s1.charAt(i)=='[' || s1.charAt(i)==']')
                s3=s3+s1.charAt(i);
            else
            {
                s3=s3+s2.charAt(j);
                j++;
            }
            }
        System.out.println("The Reversed with preserved SPL CHAR");
        System.out.println(s3);
        }
    }
