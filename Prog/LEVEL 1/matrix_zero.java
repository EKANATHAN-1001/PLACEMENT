import java.util.*;
public class matrix_zero
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
				res[i][j] = mat[i][j];
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(mat[i][j] == 0)
				{
					for(int k =0;k<c;k++ )
						res[i][k]=0;
					for(int k =0;k<c;k++ )
						res[k][j]=0;
					
				}
			}
		}
		
		System.out.println("");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println("");
		}
		
		
	}
}