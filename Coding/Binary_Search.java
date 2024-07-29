import java.util.*;
import java.io.*;
public class Binary_Search{
    public static void binary(int low,int high,int arr[],int k){
        if(high >= low)
        {
        int mid = (low+high)/2;
        if(arr[mid]==k){
            System.out.println("Found at pos : "+(mid+1));
        }
        else if(k < arr[mid]){
            high = mid - 1;
            binary(low,high,arr,k);
        }
        else if(k > arr[mid]){
            low =mid +1;
            binary(low,high,arr,k);
        }
        }
        else{
            System.out.println("Not found");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the search value");
        int k = sc.nextInt();
        binary(0,n-1,arr,k);
    }
}