package practice;

import java.util.Arrays;

public class ratInAMazeBackTracking {
	public static void main(String[] args) {
		ratInMaze(new boolean[][]{{true,false,false,false},{true,true,false,true},{false,true,false,false},{true,true,true,true}});
	}
	static boolean[][] sol;
	public static void ratInMaze(boolean[][] maze) {
		sol=new boolean[maze.length][maze[0].length];
		//Arrays.fill(sol, false);
		System.out.println(solution(maze,0,0));
		for(boolean[] a:sol) {
			for(boolean e:a)
				System.out.print(e+" ");
			System.out.println("");
		}
	}
	
	public static boolean solution(boolean[][] maze,int row,int col) {
		if(row==(maze.length-1) && col==(maze[0].length-1)){
			sol[row][col]=true;
			return true;
		}
		if(isSafe(maze,row,col)) {
			System.out.println("entered is safe"+row+" "+col);
			sol[row][col]=true;
			if(solution(maze,row+1,col)) return true;
			else if(solution(maze,row,col+1)) return true;
			sol[row][col]=false;
		}
		return false;
			
		
		
	}

	private static boolean isSafe(boolean[][] maze,int row, int col) {
		return (row<maze.length && col<maze[0].length && maze[row][col]);
	}
}
