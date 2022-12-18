package arrays;

public class minimumAdjacentDifference {
	public static void main(String[] args) {
		int[] re=new int[] {8,-8,9,-9,10,-11,12};
		//re.add(1);re.add(2);re.add(3);re.add(4);re.add(5);
		System.out.println(minAdjDiff(re, 7));
//		for(int a :re)
//			System.out.println(a);
	}
	
	public static int minAdjDiff(int arr[], int n) {
        
        // Your code here
        int minDiff=Math.abs(arr[n-1]-arr[0]);
        System.out.println("min diff:"+minDiff);
        for(int i=0;i<(n-1);++i) {
        	int diff=Math.abs(arr[i]-arr[i+1]);
        	minDiff=Math.min(diff, minDiff);
        	//System.out.println("min diff:"+minDiff);
        }
        return minDiff;
    }
}
