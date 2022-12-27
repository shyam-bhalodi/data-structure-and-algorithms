package searching;

public class squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(floorSqrt(9));
	}
	
	static long floorSqrt(long x)
	 {
		long low=0,high=x,root=1;
		while(low<=high) {
			long mid=low+(high-low)/2;
			if((mid*mid)<=x) {
				root=mid;
				low=mid+1;
			}else {
				high=mid-1;
			}
				
		}
		return root;
	 }

}
