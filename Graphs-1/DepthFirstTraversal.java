package graphs;

import java.util.Scanner;

public class DFS {

	public static void dfstravel(int adjmatrix[][],int currentVertex,boolean visited[])
	{
		visited[currentVertex]=true;
		System.out.print(currentVertex+" ");

		for(int i =0;i<adjmatrix.length;i++)
		{
			if(adjmatrix[currentVertex][i]==1 && visited[i]==false)
			{
				dfstravel(adjmatrix, i,visited);
			}
		}
	}

	public static void dfs(int adjmatrix[][])
	{
		boolean visited[] = new boolean[adjmatrix.length];
		dfstravel(adjmatrix, 0,visited );
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices: ");
		int n = sc.nextInt();
		System.out.println("Enter the number of edges: ");
		int e = sc.nextInt();

		int adjmatrix[][] = new int[n][n];

		for(int i = 0;i<e;i++)
		{
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			adjmatrix[v1][v2]=1;
			adjmatrix[v2][v1]=1;
		}

		dfs(adjmatrix);

	}

}
