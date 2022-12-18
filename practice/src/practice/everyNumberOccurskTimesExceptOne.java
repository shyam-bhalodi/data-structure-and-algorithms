package practice;

public class everyNumberOccurskTimesExceptOne {

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {0,1,0,1,0,1,99}));
	}
	
	 
	    public static int singleNumber(int[] nums) {
	    	int bits[]=new int[32];
	        for(int i=0;i<32;++i) {
	        	for(int j=0;j<nums.length;++j) {
	        		if((nums[j]&(1<<i))!=0) {
	        			bits[i]+=1;
	        		}
	        			
	        	}
	        	
	        }
	        int res=0;
	        for(int i=0;i<32;++i)
	        	res+=(bits[i]%3)<<i;
	        return res;
	    }

}
