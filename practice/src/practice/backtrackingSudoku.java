package practice;

public class backtrackingSudoku {
	public static void main(String[] args) {
		int[][] board = new int[][] {
            { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
            { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
            { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
            { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
            { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
            { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
            { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };
        
        if (solveSudoku(board))
        {
            // print solution
            print(board);
        }
        else {
            System.out.println("No solution");
        }
	}
	
	public static void print(
	        int[][] board)
	    {
	         
	        // We got the answer, just print it
	        for (int r = 0; r < board.length; r++)
	        {
	            for (int d = 0; d < board[r].length; d++)
	            {
	                System.out.print(board[r][d]);
	                System.out.print(" ");
	            }
	            System.out.print("\n");  
	        }
	    }
	
	public static boolean solveSudoku(int[][] board) {
		int row=-1,col=-1;
		boolean isEmpty=false;
		for(int i=0;i<board.length;++i) {
			for(int j=0;j<board[i].length;++j) {
				if(board[i][j]==0)
				{
					row=i;col=j;
					isEmpty=true;
					break;
				}
			}
			if(isEmpty) {
				break;
			}
		}
		
		if(!isEmpty) {
			return true;
		}
		
		for(int i=1;i<=9;++i) {
			if(isSafe(board,row,col,i)) {
				board[row][col]=i;
				if(solveSudoku(board)) {
					return true;
				}
				board[row][col]=0;
			}
		}
		return false;
	}
	
	public static boolean isSafe(int[][] board,int row,int col,int num) {
		for(int j=0;j<board.length;++j) {
			if(board[j][col]==num)
				return false;
		}
		for(int i=0;i<board[0].length;++i) {
			if(board[row][i]==num)
				return false;
		}
		
		int startRow=row-row%3;
		int startCol=col-col%3;
		for(int i=0;i<3;++i) {
			for(int j=0;j<3;++j) {
				if(board[i+startRow][j+startCol]==num)
					return false;
			}
		}
		return true;
		
	}
}
