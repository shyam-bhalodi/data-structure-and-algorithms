package searching;

import java.util.ArrayList;

public class subArrayWithGivenSum {
	public static void main(String[] args) {
		System.out.println("{}"+subarraySum(new int[] {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10}, 10, 15));
	}
	
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
		ArrayList<Integer> res=new ArrayList<>();
        int sum=0,i=0,j=0;
        while(sum<s) {
        	sum+=arr[j];
        	j++;
        }
        System.out.println("sum 1:"+sum);
        if(sum==s) {
        	res.add(1);
        	res.add(j);
        	return res;
        }
        System.out.println("i"+i+"j"+j);
        for(;j<n;j++) {
        	
        	if(sum>s) {
        		while(sum>s && i<=j) {
        			sum-=arr[i];
        			i++;
        		}
        		System.out.println("sum2:"+sum);
        	}
        	if(sum<s) {
        		sum+=arr[j];
        	}
        	if(s==sum) {
        		res.add(i+1);
            	res.add(j);
            	break;
        	}
        	
        }
        return res;
    }
	
}
