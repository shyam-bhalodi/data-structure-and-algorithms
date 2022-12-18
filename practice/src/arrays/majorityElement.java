package arrays;

public class majorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(majorityElement(new int[] {3,3,4}));
	}
	
	public static int majorityElement(int[] nums) {
		if(nums.length==1)
			return nums[0];
		
		int element=nums[0],count=1;
		
		for(int i=1;i<nums.length;++i) {
			if(nums[i]!=element)
				count--;
			if(nums[i]==element)
				count++;
			if(count==0) {
				element=nums[i];count=1;
			}
		}
		
		int newCount=0;
		for(int a:nums) {
			if(element==a)
				newCount++;
		}
		if(newCount>(nums.length/2))
			return element;
		return -1;
	}

}
