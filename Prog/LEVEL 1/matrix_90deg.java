import java.util.*;
public class matrix_90deg
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int [][]mat = new int[r][c];
		int [][] res = new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("90 DEG turn");
		// 90 DEG matrix 
		// column first row is second
		for(int i=0;i<c;i++)
		{
			for(int j=r-1;j>=0;j--)
			{
				System.out.print(mat[j][i]+" ");
			}
			System.out.println("");
		}
		
		
		System.out.println("180 DEG turn");
		// 180 DEG matrix 
		// row first column is second
		for(int i=r-1;i>=0;i--)
		{
			for(int j=c-1;j>=0;j--)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("270 DEG turn");
		// 270 DEG matrix 
		// row first column is second
		for(int i=r-1;i>=0;i--)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(mat[j][i]+" ");
			}
			System.out.println("");
		}
		
	}
}