package allproblems;

public class PrintRatInAMaze {
	
	public static void ratInMaze(int maze[][])
	{
		int n = maze.length;
		int path[][]=new int[n][n];
		printAllPaths(maze,0,0,path);
	}
	
	public static void printAllPaths(int maze[][],int i,int j, int path[][])
	{
		int n = maze.length;
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1)
		{
			return;
		}
		path[i][j]=1;
		
		if(i==n-1 && j==n-1)
		{
			for(int r = 0;r<n;r++)
			{
				for(int c = 0;c<n;c++)
				{
					System.out.print(path[r][c]+" ");
				}
				System.out.println();
			}
			System.out.println();
			path[i][j]=0;
			return;
		}
		
		//top
		printAllPaths(maze,i-1,j,path);
		//down
		printAllPaths(maze, i+1, j, path);
		//right
		printAllPaths(maze,i,j+1,path);
		//left
		printAllPaths(maze, i, j-1, path);
		path[i][j]=0;
		
		
		
	}
	
	

	public static void main(String[] args) {
		int maze[][]= {{1,1,0},{1,1,0},{1,1,1}};
		ratInMaze(maze);
	}

}
