package arrays;

public class maximumOccuredInteger {
	public static void main(String[] args) {
		int L[] = {1,4,3,1}, R[] = {15,8,5,4};
		System.out.println(maxOccured(L, R, 4, 15));
	}
	
	public static int maxOccured(int L[], int R[], int n, int maxx){
        int[] re=new int[maxx+2];
        for(int i=0;i<n;++i) {
        	re[L[i]]+=1;
        	re[R[i]+1]-=1;
        }
        int pos=0,max=re[0];
        for(int i=1;i<re.length;++i) {
        	re[i]+=re[i-1];
        	if(re[i]>max) {
        		pos=i;
        		max=re[i];
        	}
        }
        return pos;
    }
}
