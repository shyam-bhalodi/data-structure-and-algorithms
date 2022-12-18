package arrays;

public class maximumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxIndexDiff(new int[] {34, 8, 10, 3, 2, 80, 30, 33, 1}, 9));
	}
	
	static int maxIndexDiff(int A[], int N) { 
        
        int rMax[]=new int[N];
        rMax[N-1]=A[N-1];
        for(int i=N-2;i>=0;--i) {
        	rMax[i]=Math.max(rMax[i+1], A[i]);
        }
        
        int i=0,j=0,max=-1;
        while(i<N && j<N) {
        	if(A[i]<=rMax[j]) {
        		max=Math.max(max, j-i);
        		j++;
        	}else
        		i++;
        }
        return max;
    }

}
