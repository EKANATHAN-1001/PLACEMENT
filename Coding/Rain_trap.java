import java.util.*;
import java.io.*;
public class Rain_trap{
    public static int level(int n,int arr[]){
        int leftarr[]  = new int[n];
        int rightarr[] = new int[n];
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i] >= max){
                max = arr[i];
            }
            leftarr[i] = max;
        }
        System.out.println(Arrays.toString(leftarr));
        max = arr[n-1];
        for(int i=n-1;i>=0;i--){
            if(arr[i] >= max){
                max = arr[i];
            }
            rightarr[i] = max;
        }
        System.out.println(Arrays.toString(rightarr));
        int water = 0;
        for(int i=0;i<n;i++){
            water = water + Math.min(leftarr[i],rightarr[i]) - arr[i];
        }
        System.out.println(water);
        return water;
    }
    public static void main(String args[]){
        int arr[] = {3,1,2,4,0,1,3,2};
        System.out.println(level(8,arr));
    }
}