package arrays;

import java.util.ArrayList;

public class rotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] re=new int[] {1,2,3,4,5};
		//re.add(1);re.add(2);re.add(3);re.add(4);re.add(5);
		rotateArr(re, 2, 5);
		for(int a :re)
			System.out.println(a);
	}
	
	 static void rotateArr(int arr[], int d, int n)
	    {
	        // add your code here
		 	reverseArray(arr, 0, d-1);
		 	reverseArray(arr, d, n-1);
		 	reverseArray(arr, 0, n-1);
	    }

	 static void reverseArray(int arr[],int l,int r) {
		 while(l<r) {
			 int temp=arr[l];
			 arr[l]=arr[r];
			 arr[r]=temp;
			 r--;l++;
		 }
	 }
}
