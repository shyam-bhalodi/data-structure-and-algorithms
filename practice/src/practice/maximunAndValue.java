package practice;

public class maximunAndValue {

	public static void main(String[] args) {
		int arr[] = {4, 8, 6, 2};
	    int n = arr.length;
	    System.out.println("Maximum AND Value = " +
	                       maxAND(arr, n));

	}
	
	public static int maxAND (int arr[], int N) {
        
        int res=0,count;
        
        for(int bit=31;bit>=0;bit--) {
        	
        	count=patternCount(res | (1<<bit), arr, arr.length);
        	if(count>=2)
        		res|=1<<bit;
        	
        }
        
        return res;
    }

	public static int patternCount(int pattern,int[] arr,int n) {
		int count =0;
		for(int i=0;i<arr.length;++i)
			if((pattern&arr[i])==pattern)
				count++;
		return count;
	}
	
}
