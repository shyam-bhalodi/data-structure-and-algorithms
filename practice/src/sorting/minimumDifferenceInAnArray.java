package sorting;

public class minimumDifferenceInAnArray {

	public static void main(String[] args) {
		System.out.println(MinimumDifference(new int[] {3, 10, 8, 6}, 4));
	}
	
	static int MinimumDifference(int arr[], int n)
    {
        int res=Integer.MAX_VALUE;
        for(int i=1;i<n;++i) {
        	res=Math.min(res, Math.abs(arr[i]-arr[i-1]));
        }
        return res;
    }
}
