import java.util.*;
import java.io.*;
public class max_subarray{
    static int func(int n, int arr[]){
        if(n == 1)
            return arr[0];
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i=0; i<n-1; i++){
            sum = arr[i];
            for(int j=i+1;j<n;j++){
                if(sum>max)
                    max = sum;
                sum = sum + arr[j];
                if(sum>max)               
                    max = sum;
            }
        }
        if(arr[n-1]>max)
            return arr[n-1];
        return max;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(func(n,arr));
    }
}