package practice;

public class backtrackingRatInMazeMultipleSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maze[][] = {{1},{1}};

		solveMaze(maze);
	}
	
	public static void solveMaze(int[][] maze) {
		int sol[][]=new int[1][1];
		if (solveMazeUtil(maze, 0, 0, sol) == false)
        {
            System.out.printf("Solution doesn't exist");
            
        }
 
        printSolution(sol);
	}
	
	public static boolean solveMazeUtil(int[][] maze,int row, int col,int[][] sol) {
		if(row==(maze.length-1) && col==(maze.length-1)) {
			sol[row][col]=1;
			return true;
		}
		if(isSafe(maze,row,col)) {
			sol[row][col]=1;
			for(int i=1;i<=maze[row][col];++i) {
				if(solveMazeUtil(maze,row+i,col,sol))
					return true;
			}
			for(int i=1;i<=maze[row][col];++i) {
				if(solveMazeUtil(maze,row,col+i,sol))
					return true;
			}
			sol[row][col]=0;
		}
		return false;
	}
	
	static void printSolution(int sol[][])
    {
        for (int i = 0; i < sol.length; i++)
        {
            for (int j = 0; j < sol.length; j++)
            {
                System.out.printf(" %d ", sol[i][j]);
            }
            System.out.printf("\n");
        }
    }
	
	static boolean isSafe(int maze[][], int x, int y)
    {
         
        // if (x, y outside maze) return false
        if (x >= 0 && x < maze.length && y >= 0 &&
             y < maze.length && maze[x][y] != 0)
        {
            return true;
        }
 
        return false;
    }

}
