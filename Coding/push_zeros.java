import java.util.*;
import java.io.*;
public class push_zeros{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        for(;count<n;count++)
        {
            arr[count]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}