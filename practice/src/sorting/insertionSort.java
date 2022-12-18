package sorting;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertionSortAlgo(new int[] {7,4,3,8,1,9,4});
	}
	
	static void insertionSortAlgo(int[] arr) {
		for(int i=1;i<(arr.length);++i) {
			int key=arr[i],j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
		}
		
		for(int a:arr)
			System.out.println(a);
	}
}
