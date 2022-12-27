package searching;

public class medianTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMedian(new int[] {1,2,3,4,5},5,new int[] {3,4,5,6,7,8},6));
	}
	
	public static int findMedian(int arr[], int n, int brr[], int m)
    {
        int low=0,high=n-1;
        while(low<=high) {
        	int i=low+(high-low)/2;
        	int j=(n+m+1)/2-i;
        	int max1=(i==0)?Integer.MIN_VALUE:arr[i-1];
        	int min1=(i==(n-1))?Integer.MAX_VALUE:arr[i];
        	int max2=(j==0)?Integer.MIN_VALUE:brr[j-1];
        	int min2=(j==(m-1))?Integer.MAX_VALUE:brr[j];
        	if((max1<=min2)&& max2<=min1) {
        		if((n+m)%2==0) {
        			return (int) Math.floor((double) ((Math.max(max1, max2)+Math.min(min1, min2))/2));
        		}else {
        			return Math.max(max1, max2);
        		}
        	}else if(max1>min2) {
        		high=i-1;
        	}else {
        		low=i+1;
        	}
        }
        return -1;
    }

}
