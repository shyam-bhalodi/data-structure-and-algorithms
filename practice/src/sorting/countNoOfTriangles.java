package sorting;

import java.util.Arrays;

public class countNoOfTriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int findNumberOfTriangles(int arr[], int n)
    {
        int res=0;
        Arrays.sort(arr);
        for(int i=n-1;i>=2;--i) {
        	int j=0;
        	int k=i-1;
        	while(j<k) {
        		if((arr[j]+arr[k])>arr[i]) {
        			res+=k-j;
        			k--;
        		}else {
        			j++;
        		}
        	}
        	
        }
        return res;
    }


}
