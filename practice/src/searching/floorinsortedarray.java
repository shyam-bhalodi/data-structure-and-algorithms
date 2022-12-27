package searching;

public class floorinsortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findFloor(new long[] {1,2,8,10,11,12,19},7,5));
	}
	
	 static int findFloor(long arr[], int n, long x)
	    {
	        int low=0,high=n-1, res=0;
	        while(low<=high) {
	        	int mid=low+(high-low)/2;
	        	if(arr[mid]<=x)
	        		res=mid;
	        	if(arr[mid]>x)
	        		high=mid-1;
	        	else
	        		low=mid+1;
	        }
	        return res;
	    }

}
