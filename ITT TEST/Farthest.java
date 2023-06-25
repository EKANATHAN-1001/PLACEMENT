import java.util.*;
public class Farthest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of array Element");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the array Elements");
        for(int i=0;i<a;i++)
        {
            arr[i]= sc.nextInt();
        }
        int s =0,e=a-1,flag=0;
        for(int i=0;i<a;i++)
        {
            if(arr[i] == 0)
            {
                flag =1;
                int d1 = i-s;
                int d2 = e-i;
                if(d1>d2)
                {
                    System.out.println(arr[0]);
                    break;
                }
                else if(d2>d1)
                {
                    System.out.println(arr[e]);
                    break;
                }
                else if(d1==d2)
                {
                    if(arr[s]<=arr[e])
                    {
                        System.out.println(arr[s]);
                        break;
                    }
                    else
                    {
                        System.out.println(arr[e]);
                        break;
                    }
                }
                
            }
        }
        if(flag ==0)
            System.out.println("-1");
    }
    
}
