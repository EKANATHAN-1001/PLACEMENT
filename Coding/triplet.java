import java.util.*;
import java.io.*;
public class triplet{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0,a=0;
        int arr[] = new int[n];
        String str = "";
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            str = str + String.valueOf(arr[i]);
        }
        Arrays.sort(arr);
        for (int i=0;i<n-1;i++){
            a = arr[i]+arr[i+1];
            for(int j=0;j<n;j++){
                if(a==arr[i])
                    count++;
            }
        }
        System.out.println(count);
    }
}