package arrays;

public class checkArraySortedAndRotated {
	public static void main(String[] args) {
		System.out.println(checkRotatedAndSorted(new int[] {1,2,3,4}, 4));
	}
	
	public static boolean checkRotatedAndSorted(int arr[], int num){
        
        // Your code here
		
		int order=arr[0]>arr[num-1]?1:-1;
		int count=0;
		if(order==1) {
			for(int i=0;i<(num-1);++i) {
				if(arr[i]>arr[i+1])
					count++;
				if(count>1)
					return false;
			}
		}else {

			for(int i=0;i<(num-1);++i) {
				if(arr[i]<arr[i+1])
					count++;
				if(count>1)
					return false;
			}
		
			
		}
     
		return true;
    }
}
