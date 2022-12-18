package arrays;

import java.util.ArrayList;

public class reverseArraysInGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> re=new ArrayList<>();
		re.add(1);re.add(2);re.add(3);re.add(4);re.add(5);
//		for(int a :re)
//			System.out.println(a);
		reverseInGroups(re, 5, 3);
		for(int a :re)
			System.out.println(a);
	}
	
	public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        for(int i=0;i<n;i+=k){
            int start=i,end=Math.min(n-1,i+k-1);
           // System.out.println("start:"+start+"end:"+end);
            while(start<end){
                int temp=arr.get(start);
                
               // System.out.print("pos:"+start+"element:"+temp);
                arr.set(start, arr.get(end));
                arr.set(end, temp);
                end--;start++;
//                for(int a :arr)
//        			System.out.print(a);
           }
        }
    }

}
