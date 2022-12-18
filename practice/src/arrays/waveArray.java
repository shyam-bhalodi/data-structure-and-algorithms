package arrays;

public class waveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void convertToWave(int n, int[] a) {
        for(int i=1;i<n;i+=2) {
        	int temp=a[i-1];
        	a[i-1]=a[i];
        	a[i]=temp;
        }
    }

}
