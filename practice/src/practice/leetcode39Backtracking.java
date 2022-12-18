package practice;

import java.util.ArrayList;
import java.util.List;

public class leetcode39Backtracking {
	public static void main(String[] args) {
		combinationSum(new int[] {2}, 1);
	}
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		solve(candidates,target,0,new ArrayList<Integer>(),res);
		for(List<Integer> a:res) {
			for(int e:a)
				System.out.print(e+" ");
			System.out.println("");
		}
		return res;
	}

	private static void solve(int[] candidates, int target, int i, ArrayList<Integer> curList, List<List<Integer>> res) {
		if(target==0)
		{
			res.add(new ArrayList(curList));
			return;
		}
		if(target<0)
			return;
		if(i>(candidates.length-1))
			return;
		
		curList.add(candidates[i]);
		solve(candidates,target-candidates[i],i,curList,res);
		curList.remove(curList.size()-1);
		solve(candidates,target,i+1,curList,res);
		
	}
}
