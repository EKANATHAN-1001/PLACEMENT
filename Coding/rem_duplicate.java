import java.util.*;
import java.io.*;
public class rem_duplicate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int j=0;
        System.out.print(arr[0]+" ");
        for(int i=0;i<n;i++){
            if(arr[j]!=arr[i]){
            }
        }
    }
}