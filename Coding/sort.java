import java.io.*;
import java.util.*;
public class sort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Integer arr[] = new Integer[a];
        int temp;
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr,Collections.reverseOrder());
        // for(int i=0;i<a-1;i++){
        //     for(int j=i;j<a;j++){
        //         if(arr[i]>arr[j])
        //         {
        //             temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        for(int i=0;i<a;i++){
            System.out.println(arr[i]);
        }
    }
}