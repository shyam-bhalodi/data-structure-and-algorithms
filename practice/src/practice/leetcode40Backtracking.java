package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class leetcode40Backtracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combinationSum2(new int[] {10,1,2,7,6,1,5}, 8);
	}
	
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> List=new ArrayList<List<Integer>>();
		Set<List<Integer>> res=new HashSet<List<Integer>>();
		Arrays.sort(candidates);
		solve(candidates,target,0,res,new ArrayList<Integer>());
		for(List<Integer> a: res) {
			for(int e:a)
				System.out.print(e+" ");
			System.out.println("");
		}
		List.addAll(res);
		return List;
    }

	private static void solve(int[] candidates, int target, int index, Set<List<Integer>> res,
			ArrayList<Integer> curList) {
		if(target==0) {
			res.add(new ArrayList(curList));
			return;
		}
		if(target<0)
			return;
		if(index>(candidates.length-1))
			return;
		for(int i=index;i<candidates.length;++i) {
			if(i>index && candidates[i]==candidates[i-1]) {
				continue;
			}
			curList.add(candidates[i]);
			solve(candidates,target-candidates[i],i+1,res,curList);
			curList.remove(curList.size()-1);
		}
		
	}

}
