import java.util.*;
public class Balance_Pran {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String expr = sc.next();
        Stack<Character> s = new Stack<Character>();
        for(int i=0;i<expr.length();i++)
        {
            if(expr.charAt(i)=='[' || expr.charAt(i)=='{' || expr.charAt(i)=='(')
                s.push(expr.charAt(i));
            else if(expr.charAt(i)==']' || expr.charAt(i)=='}' || expr.charAt(i)==')')
            {
                char b = s.pop();
                if(expr.charAt(i) == ']' && b == '[')
                    continue;
                else if(expr.charAt(i) == '}' && b=='{')
                    continue;
                else if (expr.charAt(i)==')' && b == '(')
                    continue;
                else
                    {
                        System.out.println("Not Balanced");
                        return;
                    }

            }
        }
        System.out.println("Balanced");
    }
}
