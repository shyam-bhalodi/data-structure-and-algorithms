package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class leadersInAnArray {
	public static void main(String[] args) {
		leaders(new int[] {16,17,4,3,5,2},6);
	}
	
	static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
		int curMax=arr[n-1];
		ArrayList<Integer> res=new ArrayList<>();
		res.add(curMax);
        for(int i=n-1;i>=0;--i) {
        	if(arr[i]>curMax) {
        		curMax=arr[i];
        		res.add(curMax);
        	}
        }
        Collections.reverse(res);
        for(int a:res)
        	System.out.println(a);
        return res;
    }
}
