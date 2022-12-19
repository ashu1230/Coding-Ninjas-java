package graphs;

import java.util.Scanner;
import java.util.*;

public class BFS {
	
	public static void bfs(int adjmatrix[][])
	{
		Queue<Integer> pending = new LinkedList<>();
		boolean visited[] = new boolean[adjmatrix.length];
		visited[0]=true;
		pending.add(0);
		
		while(!pending.isEmpty())
		{
			int currentVertex = pending.poll();
			System.out.print(currentVertex+" ");
			
			for(int i = 0;i<adjmatrix.length;i++)
			{
				if(adjmatrix[currentVertex][i]==1 && visited[i]==false)
				{
					pending.add(i);
					visited[i]=true;
				}
			}
		}
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
		
		bfs(adjmatrix);

	}


}
