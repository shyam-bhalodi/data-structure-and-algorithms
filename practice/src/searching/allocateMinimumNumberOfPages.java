package searching;

public class allocateMinimumNumberOfPages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findPages(new int[] {12,34,67,90},4,5));
	}

	public static int findPages(int[]A,int N,int M)
    {
        //Your code here
		int sum=0,max=0;
		for(int a: A) {
			sum+=a;
			max=Math.max(a, max);
		}
		System.out.println("sum"+sum);
		int res = -1;
		int low=max,high=sum;
		while(low<=high) {
			int mid=low+(high-low)/2;
			System.out.println("mid"+mid);
			System.out.println("low"+low);
			System.out.println("high"+high);
			System.out.println("res"+res);
			System.out.println("-------------");
			if(isFeasiable(A,mid,N,M)) {
				
				res=mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return res;
    }
	
	public static boolean isFeasiable(int[] a, int mid, int n, int m) {
		int req=1,sum=0;
		for(int i=0;i<n;++i) {
			if((sum+a[i])<=mid) {
				sum+=a[i];
			}else {
				sum=a[i];req++;
			}
		}
		return req<=m;
	}
	
}
