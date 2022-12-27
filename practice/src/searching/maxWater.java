package searching;

public class maxWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxWater(new int[] {2,1,3,4,6,5},6));
	}
	
	static int maxWater(int height[], int n) 
    { 
        //Your code here
		if(n<=2)
			return 0;
		int low=0,high=n-1;
		int res=0;
		while(low<=high) {
			int  d=Math.min(height[low], height[high]);
			res=Math.max(res, d*(high-low-1));
			if(height[low]<height[high])
				low++;
			else
				high--;
		}
		return res;
    } 

}
