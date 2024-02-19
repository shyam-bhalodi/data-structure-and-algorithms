package searching;

public class squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(2147395599));
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
public static int mySqrt(int x) {
	if(x==0 || x==1){
		return x;
	}
	int start=0,end=x,root=1;
	while(start<=end){
		int mid = start+(end-start)/2;
		if((long)mid*mid<=(long)x){
			root=mid;
			start=mid+1;
		}else{
			end=mid-1;
		}
	}

	return root;
}

}
