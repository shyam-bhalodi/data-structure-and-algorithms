package arrays;

public class rearrangeAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
arrange(new long[] {4,0,2,1,3}, 5);
	}
	
	static void arrange(long arr[], int n)
    {
        long max=n;
        for(int i=0;i<n;++i) {
        	long index=arr[i];
        	if(index<i) {
        		arr[i]= arr[i]+((arr[(int) index]%max)%max)*max;
        	}else {
        		arr[i]=arr[i]+(arr[(int) index]%max)*max;
        	}
        }
        
        for(int i=0;i<n;++i)
        	arr[i]=arr[i]/max;
    }

}
