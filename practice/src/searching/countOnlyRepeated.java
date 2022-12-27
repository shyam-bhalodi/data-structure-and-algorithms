package searching;

public class countOnlyRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair res=findRepeating(new Long[] {(long) 1,(long) 2,(long) 3,(long) 3,(long) 4},5);
		System.out.println(res.x);
		System.out.println(res.y);
	}
	
	static class Pair{
        long x;
        long y;
        
        Pair(long x, long y){
            this.x = x;
            this.y = y;
        }
    }
   //Function to find repeated element and its frequency.
   public static Pair findRepeating(Long arr[],int n)
   {
       //Your code here
	   int low=0,high=n;
	   long count=-1;
	   count=n-(arr[n-1]-arr[0]);
	   if(count==1) {
		   return new Pair(-1, -1);
	   }
	   while(low<=high) {
		   int mid=low+(high-low)/2;
		   if((mid>0 && (arr[mid]-arr[mid-1])==0) || (mid<n && (arr[mid+1]-arr[mid])==0)) {
			   return new Pair(arr[mid],count);
		   }
		   if((arr[mid]-arr[low])==(mid-low))
			   low=mid+1;
		   else
			   high=mid-1;
	   }
	   return new Pair(-1, -1);
   }  
   
}
