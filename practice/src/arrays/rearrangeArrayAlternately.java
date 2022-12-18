package arrays;

public class rearrangeArrayAlternately {
	public static void main(String[] args) {
		rearrange(new long[] {1,2,3,4,5,6}, 6);
	}
	
	public static void rearrange(long arr[], int n){
        int mini=0,minj=n-1;
        long max=Integer.MIN_VALUE;
        for(long a:arr)
        	max=Math.max(a, max);
        max=max+1;
        for(int i=0;i<n;++i) {
        	if((i&1)==0) {
        		arr[i]=arr[i]+(arr[minj]%max)*max;
        		minj--;
        	}else {
        		arr[i]=arr[i]+(arr[mini]%max)*max;
        		mini++;
        	}
        }
        for(int i=0;i<n;++i)
        	arr[i]/=max;
    }
}
