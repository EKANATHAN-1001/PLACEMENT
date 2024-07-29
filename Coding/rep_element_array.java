import java.util.*;
import java.io.*;
public class rep_element_array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
}