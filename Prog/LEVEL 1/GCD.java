import java.util.*;
public class GCD
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min =  (a<b)?a:b;
        for(int i=min;i>0;i--)
        {
            if(a%i==0 && b%i==0)
            {
                System.out.print(i+ " ");
                // If break is removed all possible CD (common divisor) is printed
                break;
            }

        }

    }
}