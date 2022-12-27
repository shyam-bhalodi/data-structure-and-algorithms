package searching;

public class count1inbinaryarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countOnes(new int[] {1,1,1},3));
	}
	
	
	public static int countOnes(int arr[], int N){
        
		
		int low=0,high=N-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==1) {
				if(mid<N-1 && arr[mid+1]==1) {
					low=mid+1;
				}else {
					return mid+1;
				}
			}else {
				high=mid-1;
			}
		}
		return 0;
        // Your code here
        
    }
}
