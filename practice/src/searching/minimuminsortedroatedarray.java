package searching;

public class minimuminsortedroatedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minNumber(new int[] {2,3,4,5,6,7,8,9,10,1},0,9));
	}
	
	static int minNumber(int arr[], int low, int high)
    {
		int ans=Integer.MAX_VALUE;
       while(low<high) {
    	   int mid=low+(high-low/2);
    	   
    	   if(arr[low]<=arr[mid]) {
    		   ans=Math.min(ans, arr[low]);
    		   low=mid+1;
    	   }else {
    		   ans=Math.min(ans, arr[mid]);
    		   high=low-1;
    	   }
    		  
       }
       return ans;
    }

}
