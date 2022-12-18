package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class backTrtackingCombinationSum {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(7);arr.add(2);arr.add(6);arr.add(5);
		combinationSum(arr, 16);

	}
	
	static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        // add your code here
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		HashSet<Integer> set=new HashSet<>();
		set.addAll(A);
		A.clear();
		A.addAll(set);
		Collections.sort(A);
		solve(0,res,A,new ArrayList<Integer>(),B);
		
		for(ArrayList<Integer> a:res) {
			for(int e:a) {
				System.out.print(e+" ");
			}
			System.out.printf("\n");
		}
		return null;
    }

	private static void solve(int index, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> a,
			ArrayList<Integer> currList, int target) {
		if(target==0) {
			res.add(new ArrayList<>(currList));
			return;
		}
		if(target<0)
			return;
		if(index>=a.size())
			return;
		ArrayList<Integer> cur=new ArrayList();
		cur.addAll(currList);
		cur.add(a.get(index));
		solve(index,res,a,cur,target-a.get(index));
		cur.remove(cur.indexOf(a.get(index)));
		solve(index+1,res,a,cur,target);
	}

}
