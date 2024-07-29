import java.util.*;
import java.io.*;
public class Linear_Search{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be search");
        int k = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                System.out.println("Found at pos : "+(i+1));
                return;
            }
        }
        System.out.println("Not Found");
    }
}