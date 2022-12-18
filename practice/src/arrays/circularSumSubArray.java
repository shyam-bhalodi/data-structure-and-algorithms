package arrays;

public class circularSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(circularSubarraySum(new int[] {-12,-14}, 2));
	}
	
	static int circularSubarraySum(int a[], int n) {
        
        // Your code here
        return Integer.max(kadane(a,n), reverseKadane(a,n));
    }

	private static int kadane(int[] a, int n) {
		// TODO Auto-generated method stub
		int maxEnding=a[0],res=a[0];
		for(int i=1;i<n;++i) {
			maxEnding=Math.max(maxEnding+a[i],a[i]);
			res=Math.max(res, maxEnding);
		}
		System.out.println("max element:"+res);
		return res;
	}

	private static int reverseKadane(int[] a, int n) {
		// TODO Auto-generated method stub
		int maxEnding=a[0],res=a[0],sum=a[0];
		for(int i=1;i<n;++i) {
			sum+=a[i];
			maxEnding=Math.min(maxEnding+a[i],a[i]);
			res=Math.min(res, maxEnding);
		}
		System.out.println("min element:"+Math.min(sum-res,res));
		return Math.min(sum-res,res);
	}

}
