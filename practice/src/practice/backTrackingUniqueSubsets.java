package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class backTrackingUniqueSubsets {
	public static void main(String[] args) {
		int arr[] = {2,1,2};
		AllSubsets(arr, 3);
	}
	
	public static ArrayList<ArrayList <Integer>> AllSubsets(int arr[], int n)
    {
        // your code here
		ArrayList<ArrayList <Integer>> result=new ArrayList<>();
		ArrayList<ArrayList <Integer>> ans=new ArrayList<>();
		//Arrays.sort(arr,Collections.reverseOrder());
		solve(arr,ans,new ArrayList<Integer>(),0);
		
		for(ArrayList<Integer> x:ans)
        {
			Collections.sort(x);
            if(result.contains(x)==false){
                result.add(x);
            }
        }
		Collections.sort(result,(o1, o2) -> {
           for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
               int c = o1.get(i).compareTo(o2.get(i));
               if (c != 0) {
                   return c;
               }
           }
           return Integer.compare(o1.size(), o2.size());
       });
		
		return result;
    }

	private static void solve(int[] arr, ArrayList<ArrayList<Integer>> res,
			ArrayList<Integer> currList, int index) {
		if(index==(arr.length)) {
			//System.out.println(index);
			res.add(new ArrayList<Integer>(currList));
			return ;
		}
		solve(arr,res,currList,index+1);
		currList.add(arr[index]);
		solve(arr,res,currList,index+1);
		currList.remove(currList.size()-1);
	}
}
