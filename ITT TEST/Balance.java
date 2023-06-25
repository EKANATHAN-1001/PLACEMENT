import java.util.*;
public class Balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Expression");
        String a = sc.next();
        Stack <Character> s = new Stack<Character>();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='{'||a.charAt(i)=='['||a.charAt(i)=='(')
                s.push(a.charAt(i));
            else if(a.charAt(i)=='}'||a.charAt(i)==']'||a.charAt(i)==')')
            {
                if(s.size()==0)
                {
                    System.out.println("UnBalanced");
                    return;
                }
                char b = s.pop();
                if(a.charAt(i)=='}' && b=='{')
                    continue;
                else if(a.charAt(i)==')' && b=='(')
                    continue;
                else if(a.charAt(i)==']' && b=='[')
                    continue;
                else
                {   System.out.println("Unbalanced");
                    return;
                }
              
            }
            
        }
        if(s.size()==0)
        System.out.println("Balanced");
        else 
            System.out.println("UnBalanced");
        
    }
    
}
