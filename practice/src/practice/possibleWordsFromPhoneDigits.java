package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class possibleWordsFromPhoneDigits {

	public static void main(String[] args) {
		List<String> res=possibleWords(new int[] {2,3,4},3);
		for(String a: res)
			System.out.println(a);
	}
	
	 public static ArrayList <String> possibleWords(int a[], int N)
	 {	
		 Map<Integer,List<String>> data2=new HashMap<>();
		 data2.put(2, Arrays.asList("a","b","c"));
		 data2.put(3, Arrays.asList("d","e","f"));
		 data2.put(4, Arrays.asList("g","h","i"));
		 data2.put(5, Arrays.asList("j","k","l"));
		 data2.put(6, Arrays.asList("m","n","o"));
		 data2.put(7,Arrays.asList("p","q","r","s"));
		 data2.put(8, Arrays.asList("t","u","v"));
		 data2.put(9,Arrays.asList("w","x","y","z"));
		 return pissibleWords2(a,N,new String(),0,data2);
	     //return null; 
	 }
	 
	
	 
	 
	 public static ArrayList<String> pissibleWords2(int a[],int N, String curr,int pos, Map<Integer, List<String>> data) {
		 if(curr.length()==N) {
			 return new ArrayList<String>() {{add(curr);}};
		 }
		 ArrayList<String> res=new ArrayList<>();
		 List<String> letters=data.get(a[pos]);
		 for(String let:letters) {
			 res.addAll( pissibleWords2(a,N,curr+let,pos+1,data));
		 }
		 
		 return res;
	 }

}
