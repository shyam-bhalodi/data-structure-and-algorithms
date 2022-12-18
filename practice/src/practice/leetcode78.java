package practice;

import java.util.ArrayList;
import java.util.List;

public class leetcode78 {
	public static void main(String[] args) {
		System.out.println(subsets(new int[] {1,2,3}));
	}
	
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res=new ArrayList<>();
		int pow=(int) Math.pow(2, nums.length);
		for(int i=0;i<pow;++i) {
			List<Integer> nu=new ArrayList<>();
			for(int j=0;j<nums.length;++j) {
				if((i&(1<<j))!=0)
					nu.add(nums[j]);
			}
			res.add(nu);
		}
		return res;
    }

}
