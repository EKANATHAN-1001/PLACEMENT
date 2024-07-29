import java.util.*;
import java.io.*;
public class sub_array_sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        int sum = 0,k=0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            if(sum == target){
                System.out.println((k+1)+" "+(i+1));
                return;
            }
            else if(sum > target){
                i = k;
                k++;
                sum=0;
            }
        }
        System.out.println(-1);
    }
}