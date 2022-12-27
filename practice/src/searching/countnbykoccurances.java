package searching;

import java.util.HashMap;
import java.util.Map;

public class countnbykoccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int countOccurence(int[] arr, int n, int k) 
    {
        HashMap<Integer, Integer> counts=new HashMap<>();
        for(int a : arr) {
        	if(counts.containsKey(a)) {
        		int c=counts.get(a);
        		counts.put(a, c+1);
        	}else {
        		counts.put(a, 1);
        	}
        }
        
        int res=0,div=(n/k);
        for(Map.Entry m: counts.entrySet()) {
        	Integer temp = (Integer)m.getValue();
        	if(temp>=div)
        		res++;
        }
     return res;   
    }

}
