package searching;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(searchInSorted(new int[] {3,3},2,2));
	}
	
	static int searchInSorted(int arr[], int N, int K)
    {
		
		int low=0,high=N-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==K)
				return mid;
			if(arr[mid]>K) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return -1;
       
        
    }
}
