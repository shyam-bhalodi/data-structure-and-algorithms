package arrays;

import java.util.Arrays;

public class smallestPositiveMissingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(missingNumber(new int[] {28 ,7 ,-36 ,21 ,-21 ,-50 ,9 ,-32}, 8));
	}
	
	static int missingNumber(int arr[], int size)
    {
        // Your code here
		Arrays.sort(arr);
		int t=1;
		for(int i=0;i<size;++i) {
			if(arr[i]>0) {
				if(arr[i]==t)
					t++;
			}
		}
		return t;
		
    }

}
