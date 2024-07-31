import java.util.*;
import java.io.*;
public class product_array_except_pos{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int left_prod[] = new int[n];
        int right_prod[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        left_prod[0] = 1;
        right_prod[n-1] = 1;
        for(int i=1;i<n;i++){
            left_prod[i] = left_prod[i-1]*arr[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right_prod[i] = right_prod[i+1]*arr[i+1];
        }
        System.out.println(Arrays.toString(left_prod));
        System.out.println(Arrays.toString(right_prod));
        for(int i=0;i<n;i++){
            System.out.print(left_prod[i]*right_prod[i]+" ");
        }
    }
}