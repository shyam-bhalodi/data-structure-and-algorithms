package searching;

public class peakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(peakElement(new int[] {1,2,2,1},4));
	}
	
	public static int peakElement(int[] arr,int n)
    {
       //add code here.
		
		int low=0,high=n-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==(n-1) || arr[mid+1]<=arr[mid])) {
				return mid;
			}
			if(mid>0 && arr[mid-1]>arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
			
		}
		
		return 0;
    }
}
