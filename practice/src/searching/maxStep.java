package searching;

public class maxStep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxStep(new int[] {1,2,3,4},4));
	}
	
	static int maxStep(int arr[], int N)
    {
        int res=0,count=0;
        for(int i=0;i<(N-1);++i) {
        	if((arr[i+1]-arr[i])>0) {
        		count++;
        		res=Math.max(count, res);
        	}else {
        		count=0;
        	}
        }
        return res;
    }

}
