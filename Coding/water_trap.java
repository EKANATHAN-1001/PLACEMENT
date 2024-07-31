import java.util.*;
import java.io.*;
public class water_trap{
    static int level(int n,int arr[]){
        int leftmax = 0, rightmax = 0, left = 0, right = n-1, water = 0;
        while(left < right){
            if(arr[left] < arr[right]){
                if(arr[left] >= leftmax )
                    leftmax = arr[left];
                else
                    water = water + leftmax - arr[left];
                left++;
                
            }
            else{
                if(arr[right] >= rightmax)
                    rightmax = arr[right];
                else
                    water = water + rightmax - arr[right];
                right--;
                
            }
        }
        return water;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(level(n,arr));

    }
}