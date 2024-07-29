import java.util.*;
import java.io.*;
public class selection_sort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0],pos=0;
        for(int i=0;i<n-1;i++){
            min = arr[i];
            pos = i;
            for(int j=i;j<n;j++)
            {
                if(arr[j] < min)
                {
                    min = arr[j];
                    pos = j;
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}