package graphs;

import java.util.*;

public class HasPath {
	
	
	
	public static boolean haspath(int adjmatrix[][],int v1,int v2)
	{
		Queue<Integer> pending = new LinkedList<>();
		boolean visited[] = new boolean[adjmatrix.length];
		
		pending.add(0);
		visited[0]=true;
		
		int n = adjmatrix.length;
		if(v1>=n || v2>=n)
		{
			return false;
		}
		
		while(!pending.isEmpty())
		{
			if(visited[v1]==true && visited[v2]==true)
			{
				return true;
			}
			
			int currentVertex = pending.poll();
			for(int i =0;i<adjmatrix.length;i++)
			{
				if(adjmatrix[currentVertex][i]==1 && visited[i]==false)
				{
					pending.add(i);
					visited[i]=true;
				}
			}
		}
		
		return visited[v1] && visited[v2];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();
		int adjmatrix[][]=new int[n][n];
		for(int i =0;i<e;i++)
		{
			int v1 = sc.nextInt();
			int v2= sc.nextInt();
			adjmatrix[v1][v2]=1;
			adjmatrix[v2][v1]=1;
			
		}
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		boolean ans = haspath(adjmatrix,a,b);
		System.out.println(ans);

	}

}
