package sorting;

public class merge2SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static void merge2Arrays(int[] a,int[] b) {
		int m=a.length,n=b.length,i=0,j=0;
		while(i<m && j<n) {
			if(a[i]<=b[j]) {
				System.out.println(a[i]);
				i++;
			}
			else {
				System.out.println(b[j]);
				j++;
			}
		}
		
		while(i<m) {
			System.out.println(a[i]);i++;
		}
		while(j<n) {
			System.out.println(b[j]);j++;
		}
	}
}
