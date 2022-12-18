package practice;

public class stairsClimbingProblem {
	
	public static int count(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return count(n-1)+count(n-2);
	}
	public static void main(String[] args) {
		System.out.println(count(2));
	}
}
