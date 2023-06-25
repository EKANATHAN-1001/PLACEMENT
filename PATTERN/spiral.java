import java.util.Scanner;

// Matrix to array
public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int top = 0, left = 0, right = c - 1, bottom = r - 1;
        while (true) {
            if (left > right)
                break;
                for (int i = left; i <= right; i++) {
                    System.out.print(mat[top][i]+" ");
                
            }
            top++;
            if (top > bottom)
                break;
                for (int i = top; i <= bottom; i++) {
                    System.out.print(mat[i][bottom]+" ");
                  }
            
            right--;
            if( left>right)
                break;
                for(int i=right;i>=left;i--)
                {
                    System.out.print(mat[bottom][i]+" ");
                }
            bottom--;
            if(top>bottom)
                break;
            
                for(int i=bottom;i>=top;i--)
                {
                    System.out.print(mat[i][left]+" ");
                }
            
            left ++;
        }

    }
}
