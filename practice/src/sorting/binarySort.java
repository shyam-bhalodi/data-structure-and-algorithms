package sorting;

public class binarySort {
	public static void main(String[] args) {
		int[] arr=new int[] {1 ,0 ,1 ,1 ,1 ,1 ,1 ,0 ,0 ,0};
		binSort(arr, arr.length);
		for(int a: arr)
			System.out.println(a);
	}
	
	static void binSort(int arr[], int N)
    {
       int i=-1;
       for(int j=0;j<N;++j) {
    	   if(arr[j]==0) {
    		   i++;
    		   int temp=arr[j];
    		   arr[j]=arr[i];
    		   arr[i]=temp;
    	   }
       }
    }
}
