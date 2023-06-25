import java.util.*;
public class Step {
    public static int c_step(int a)
    {
        if(a == 0)
        {
            return 1;
        }
        else if(a<0)
        {
            return 0;
        }
        else 
            return c_step(a-2)+c_step(a-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Steps");
        int a = sc.nextInt();
        System.out.println(c_step(a));
        
    }
    
}
