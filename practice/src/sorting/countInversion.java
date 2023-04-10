package sorting;

import java.util.Arrays;

public class countInversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(inversionCount(new long[] {10, 10, 10}, 3));
	}
	
	static long inversionCount(long arr[], long N)
    {
        long res=0;
        res=inversionCountFun(arr,0,N-1);
        return res;
    }

	private static long inversionCountFun(long[] arr, long l, long r) {
		int res=0;
		if(l<r) {
			long mid=l+(r-l)/2;
			res+=inversionCountFun(arr, l, mid);
			res+=inversionCountFun(arr, mid+1, r);
			res+=countAndMerge(arr,l,mid,r);
		}
		return res;
	}

	private static long countAndMerge(long[] arr, long l, long mid, long r) {
		long[] left=Arrays.copyOfRange(arr, (int)l,(int) mid+1);
		long[] right=Arrays.copyOfRange(arr, (int)mid+1,(int) r+1);
		int i=0;
		int j=0;
		int k=(int)l;
		long res=0;
		while(i<left.length && j<right.length) {
			if(left[i]<=right[j]) {
				arr[k]=left[i];i++;k++;
			}else {
				arr[k]=right[j];j++;k++;res+=mid-l+1-i;
			}
		}
		while(i<left.length) {
			arr[k]=left[i];i++;k++;
		}
		while(j<right.length) {
			arr[k]=right[j];j++;k++;
		}
		return res;
	}

}
