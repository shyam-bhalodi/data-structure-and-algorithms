package sorting;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bubbleSortAlgo(new int[] {7,4,3,8,1,9,4});
	}
	
	static void bubbleSortAlgo(int[] arr) {
		for(int i=0;i<(arr.length-1);++i) {
			for(int j=0;j<(arr.length-i-1);++j) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int a:arr)
			System.out.println(a);
	}

}
