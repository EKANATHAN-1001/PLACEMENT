// only give Min no of appends not that string to be appended
import java.util.*;
public class Min_Append_Pali
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = ""; 
		
		int k=0,i=0,j=s.length()-1;		
		while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                k++;
                i=k;
                j=s.length()-1;
            }
        }
		System.out.println("The No of Append "+ k);
	}
}