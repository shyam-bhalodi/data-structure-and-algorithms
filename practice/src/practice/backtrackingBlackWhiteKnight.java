package practice;

public class backtrackingBlackWhiteKnight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(2,3));
	}
	
	public static long solve(int N,int M) {
		boolean[][] travelledPlaces=new boolean[N][M];
		 return solveKnight(0,0,travelledPlaces,N,M);
	}

	private static long solveKnight(int i, int j, boolean[][] travelledPlaces, int n, int m) {
		if(i==(travelledPlaces.length-1) && j==(travelledPlaces[i].length-1)) {
			if(travelledPlaces[i][j])
				return 0;
			travelledPlaces[i][j]=true;
			return countWays(i,j,n,m);
		}
		
		
		if(isSafe(i,j,n,m)) {
			if(travelledPlaces[i][j])
				return 0;
			travelledPlaces[i][j]=true;
			long res=0;
			res+=countWays(i,j,n,m)%1000000007;
			res+=solveKnight(i+1,j,travelledPlaces,n,m)%1000000007;
			res+=solveKnight(i,j+1,travelledPlaces,n,m)%1000000007;
			//res+=solveKnight(i+1,j+1,travelledPlaces,n,m);
			return res%1000000007;
		}
		
		return 0;
	}

	private static long countWays(int i, int j, int n, int m) {
		long way=0;
		if(i-2>=0 && j-1>=0) {
			way++;
		}
		if(i-2>=0 && j+1<m) {
			way++;
		}
		if(i+2<n && j-1>=0) {
			way++;
		}
		if(i+2<n && j+1<m) {
			way++;
		}
		if(i-1>=0 && j-2>=0) {
			way++;
		}
		if(i+1<n && j-2>=0) {
			way++;
		}
		if(i-1>=0 && j+2<m) {
			way++;
		}
		if(i+1<n && j+2<m) {
			way++;
		}
		System.out.println("count ways of i:"+i+"j:"+j+"way:"+way);
		return (n*m)-way-1;
	}

	private static boolean isSafe(int i, int j, int n, int m) {
		if(i<n && i>=0 && j<m && j>=0)
			return true;
		return false;
	}
	
	

}
