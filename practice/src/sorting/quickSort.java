package sorting;

public class quickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {4, 1, 3, 9, 7};
		quickSort(arr, 0, 4);
		for(int a: arr)
			System.out.println(a);
	}
	
	//Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
    	if(low<high) {
        int pivot=partition(arr, low, high);
        quickSort(arr, low, pivot-1);
        quickSort(arr, pivot+1, high);}
    }
    static int partition(int arr[], int low, int high)
    {
        int pivotEele=arr[high];
        int i=low-1;
        for(int j=low;j<high;++j) {
        	if(arr[j]<pivotEele) {
            	int temp=arr[j];
            	arr[j]=arr[i+1];
            	arr[i+1]=temp;
            	i++;
            }
        }
        int temp=arr[high];
        arr[high]=arr[i+1];
        arr[i+1]=temp;
        return i+1;
        
    } 

}
