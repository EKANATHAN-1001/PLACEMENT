import java.util.*;
public class Shortest_Path_Travelling_Sales
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cost = 0,fls=0,c=0;
		int graph[][] = new int[n][n];
		int visit[] = new int[n];
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				graph[i][j] = sc.nextInt();
 			}
			visit[i] = 0;
		}
		
		visit[0]=1;
		for(int i=0;i<n;)
		{
			visit[i]=1;
			int min = Integer.MAX_VALUE;
			for(int j=0;j<n;j++)
			{
				
				System.out.println("GRSPH "+graph[i][j]);
				if(visit[j]==0 && graph[i][j]>0)
				{
					//System.out.println("GRSPH "+graph[i][j]);
					if(min > graph[i][j])
					{
						min = graph[i][j];
						
					}
				}
			}
				/*if(min == Integer.MAX_VALUE)
				{
					for(int k=0;k<visit.length;k++)
					{	
						if(visit[k] == 0)
						{
							visit[k]=1;
							l.add(k+1);
							System.out.println("1"+l);
							fls =1;
						}
					}
						
				}
				
			System.out.println("Visit"+Arrays.toString(visit));
			if(fls ==1)
						{
							System.out.println("asjd");
							fls =0;
							break;
						}*/
			//System.out.println(min);
			for(int j=0;j<n;j++)
			{
				if(min == graph[i][j] && visit[j]==0)
				{
					cost = cost + graph[i][j];
					l.add(j+1);
					System.out.println("2"+l);
					//visit[j-1]=1;
					i=j;
					break;
				}
			}
			for(int j=0;j<visit.length;j++)
			{
				if(visit[j]==1)
					c++;
			}
			if(c==visit.length)
				break;
			c=0;
		}
		System.out.println("Path "+l+"cost "+cost);
		
	}
}