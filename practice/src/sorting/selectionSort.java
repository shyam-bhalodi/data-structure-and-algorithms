package sorting;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selectionSortAlgo(new int[] {7,4,3,8,1,9,4});
	}

	static void selectionSortAlgo(int[] arr) {
		for(int i=0;i<(arr.length);++i) {
			int min_ind=i;
			for(int j=i+1;j<(arr.length);++j) {
				if(arr[j]<arr[min_ind])
					min_ind=j;
			}
			int temp=arr[i];
			arr[i]=arr[min_ind];
			arr[min_ind]=temp;
		}
		
		for(int a:arr)
			System.out.println(a);
	}
}
