package practice;

public class leetCode260 {
	public static void main(String[] args) {
		int[] re=singleNumber(new int[] {2,1,2,3,4,1});
		for(int a: re)
		System.out.println(a);
	}
	
	public static int[] singleNumber(int[] nums) {
        int res=0;
        
        for(int i=0;i<nums.length;++i) {
        	res^=nums[i];
        	System.out.println(res);
        }
        int lsb=res&~(res-1);
        System.out.println(lsb);
        int num1=0,num2=0;
        for (int a: nums) {
        	if((lsb&a)!=0)
        		num1^=a;
        	else
        		num2^=a;
        }
        return new int[] {num1,num2};
    }
}
