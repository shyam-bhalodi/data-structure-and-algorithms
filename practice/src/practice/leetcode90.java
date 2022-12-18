package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subsetsWithDup(new int[] {4,4,4,1,4}));
	}
	
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
//        Set<List<Integer>> result=new HashSet<>();
//        int pow=(int) Math.pow(2, nums.length);
//        for(int i=0;i<pow;++i) {
//        	List<Integer> nu=new ArrayList<>();
//        	for(int j=0;j<nums.length;++j) {
//        		if((i&(1<<j))!=0)
//        			nu.add(nums[j]);
//        	}
//        	result.add(nu);
//        }
//		List<List<Integer>> res=new ArrayList<>();
//		res.addAll(result);
//		return res;
		Arrays.sort(nums);
		List<List<Integer>> li = new ArrayList<>();
        int n = nums.length;
        // running loop for 2^n as subsets are 2^n
        for(int i=0;i< (1<<n);i++){
            // creating empty array lists in li
            li.add(new ArrayList<>());
            
            // m = 1 to check setbits 
            int m = 1;
            
            // checking set bits for 1st 2nd and ith bits if +ve then add 
            // else reduce the binary no
            for(int j=0;j<n;j++){
                if((i&m)>0){
                    li.get(i).add(nums[j]);
                }
                m <<= 1;
            }
        }
        return li;
    }

}
