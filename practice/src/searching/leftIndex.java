package searching;

public class leftIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(leftIndex(10,new int[] {1,1,2,2,3,4,5,5,6,7},1));
	}

	static int leftIndex(int N, int arr[], int X)
	{
		int res=-1;
		int low=0,high=N-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==X)
				res=mid;
			if(arr[mid]>=X)
				high=mid-1;
			else
				low=mid+1;
			
		}
		return res;
	}
	 
}
