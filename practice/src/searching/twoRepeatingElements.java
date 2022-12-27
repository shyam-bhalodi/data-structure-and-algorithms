package searching;

import java.util.HashSet;

public class twoRepeatingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] res=twoRepeated(new int[] {1,2,1,3,4,3},4);
		System.out.println(res[0]+" "+res[1]);
	}
	//hashing method or HashSet method
//	public static int[] twoRepeated(int arr[], int N)
//    {
//        // Your code here
//		HashSet<Integer> dataSet=new HashSet<>();
//		int[] res=new int [2];
//		int k=0;
//		for(int a : arr)
//			{if(!dataSet.isEmpty() && dataSet.contains(a))
//				res[k++]=a;
//			dataSet.add(a);
//			}
//		return res;
//    }
	//modifying original array
	public static int[] twoRepeated(int arr[], int N)
    {
		int[] res=new int[2];
		int k=0;
		int m=N+2-1;
		for(int i=0;i<N+2;++i) {
			arr[arr[i]%m-1]+=m;
			if(arr[arr[i]%m-1]/m==2)
				res[k++]=arr[i]%m;
		}
		return res;
    }

}
