package sorting;

import java.util.ArrayList;

public class intersectionOfTwoArrays {

	
	static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m) 
    {

        ArrayList<Integer> res=new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m) {
        	
        	if(i>0 && arr1[i]==arr1[i-1]) {
        		i++;continue;
        	}
        	if(j>0 && arr2[j]==arr2[j-1]) {
        		j++;continue;
        	}
        	
        	
        	if(arr1[i]<arr2[j] ) {
        		i++;
        	}else if(arr1[i]>arr2[j]) {
        		j++;
        	}else {
        		res.add(arr1[i]);i++;j++;
        	}
        }
        
       
        return res;
    
    }
}
