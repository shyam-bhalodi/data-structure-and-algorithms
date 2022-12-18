package arrays;

import practice.maxSumContiguousSubarray;

public class kadensAlgo {
	public static void main(String[] args) {
		System.out.println(maxSubarraySum(new int[]{-1,-2,-3,-4},4));
	}
	
	static long maxSubarraySum(int arr[], int n){
        
        // Your code here
		int sum=arr[0],maxSum=arr[0];
		for(int i=1;i<n;++i) {
			sum=Math.max(sum+arr[i], arr[i]);
			maxSum=Math.max(maxSum, sum);
			//System.out.println("sum "+sum +"maxSum "+maxSum);
		}
		return maxSum;
        
    }
}
