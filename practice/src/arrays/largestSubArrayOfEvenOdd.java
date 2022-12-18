package arrays;

public class largestSubArrayOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxEvenOdd(new int[] {4,6}, 2));
	}
	
	public static int maxEvenOdd(int arr[], int n)
    {
        // your code here
		int res=1;int count=1;
		for(int i=1;i<n;++i) {
			if(((arr[i]^arr[i-1])&1)==1) {
				count++;
				res=Math.max(count, res);
			}else {
				count=1;
			}
		}
		
		return res;
    }

}
