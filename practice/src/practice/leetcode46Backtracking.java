package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode46Backtracking {
	public static void main(String[] args) {
		permute(new int[] {0,1,0,0,9});
	}
	
	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        Map<Integer,Integer> map=new HashMap();
        for(int a: nums) {
        	map.put(a, map.getOrDefault(a, 0)+1);
        }
        solve(map,res,new ArrayList<Integer>(),nums);
        for(List<Integer> a: res) {
			for(int e:a)
				System.out.print(e+" ");
			System.out.println("");
		}
        return res;
    }

	private static void solve(Map<Integer, Integer> map, List<List<Integer>> res, ArrayList<Integer> arrayList, int[] nums) {
		if(arrayList.size()==nums.length)
		{
			res.add(new ArrayList(arrayList));
			return;
		}
		
		for(Integer a: map.keySet()) {
			if(map.get(a)<=0)
				continue;
			arrayList.add(a);
			map.put(a, map.getOrDefault(a, 0)-1);
			solve(map,res,arrayList,nums);
			arrayList.remove(arrayList.size()-1);
			map.put(a, map.getOrDefault(a, 0)+1);
		}
	}

	
}
