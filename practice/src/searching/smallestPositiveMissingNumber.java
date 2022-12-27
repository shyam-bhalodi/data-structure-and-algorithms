package searching;

public class smallestPositiveMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(missingNumber(new int[] {0,-10,1,3,-20}, 5));
	}
	
	static int missingNumber(int arr[], int size)
    {
        // Your code here
		for(int i=0;i<size;++i) {
			//System.out.println(i);
			while(arr[i]>=1 && arr[i]<=size && arr[i]!=(i+1)) {
//				System.out.println(arr[i]);
//				System.out.println(i);
//				System.out.println(arr[arr[i]-1]);
				int temp=arr[arr[i]-1];
				arr[arr[i]-1]=arr[i];
				arr[i]=temp;
			}
		}
		for(int i=0;i<size;++i)
			if(arr[i]!=(i+1))
				return i+1;
		return size+1;
    }

}
