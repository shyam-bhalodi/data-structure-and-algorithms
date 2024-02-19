package practice;

public class nQueenProblemBacktracking {

	static boolean[][] sol;
	static int n=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol=new boolean[n][n];
		System.out.println(nQueenSol(0));
		for(boolean[] s:sol) {
			for(boolean a:s) {
				System.out.print(a+" ");
			}
			System.out.println("");
		}
	}
	
	public static int nQueenSol(int row) {
		if(n==row)
			return 1;
		int res=0;
		for(int i=0;i<n;++i) {
		//	System.out.println("pos is safe called for:"+row+i);
			if(isSafePos(row,i)) {
				sol[row][i]=true;
				res=res+nQueenSol(row+1);
				//if(nQueenSol(row+1)) return true;
				sol[row][i]=false;
			}
		}
		return res;
	}
	
	public static boolean isSafePos(int row,int col) {
		for(int i=0;i<row;++i)
			if(sol[i][col])
				return false;
		for(int i=row,j=col;i>=0 && j>=0;i--,j--) {
			if(sol[i][j])
				return false;
		}
		for(int i=row,j=col;i>=0&& j<n;--i,++j) {
			if(sol[i][j])
				return false;
		}
		return true;
	}

}
