package searching;

public class majorityElementVotingAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(majorityElement(new int[] {3,1,3,3,2}, 5));
	}
	
	static int majorityElement(int a[], int size)
    {
        // your code here
		
		int count =1,res=a[0];
		for(int i=1;i<size;++i) {
			if(a[i]==res)
				count++;
			else {
				count--;
				if(count==0) {
					res=a[i];count=1;
				}
			}
		}
//		System.out.println("count "+count);
//		System.out.println("res "+res);
		
		count =0;
		for(int arr: a)
			if(arr==res)
				count++;
		if(count>(size/2)) {
			return res;
		}else {
			return -1;
		}
    }

}
