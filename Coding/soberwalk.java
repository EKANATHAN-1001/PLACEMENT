import java.util.*;
import java.io.*;
public class soberwalk
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;
        int n = sc.nextInt();
        int k= 10;
        for(int i=0;i<n;i++){
            if(i%4==0){
                x = x + k;
                k = k+10;
            }
            else if(i%4==1){
                y = y + k;
                k=k+10;
            }
            else if(i%4==2){
                x = x - k;
                k= k+10;
            }
            else if(i%4==3){
                y = y - k;
                k = k+10;
            }

        }
        System.out.println(x+" "+y);

    }
}