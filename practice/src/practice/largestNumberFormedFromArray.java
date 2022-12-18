package practice;

import java.util.Arrays;
import java.util.Comparator;

public class largestNumberFormedFromArray {
 public static void main(String[] args) {
	 System.out.println("Output : "+ largestNumber(new int[]{9,44,23,12,89,1,49}));
 }
 
 public static String largestNumber(final int[] A) {
	
	 String[] str=new String[A.length];int i=0;
	 for(int a:A) {
		 str[i]=String.valueOf(a);
		 i++;
	 }
	 Arrays.sort(str, new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			return (o2+o1).compareTo(o1+o2);
		}});
	 StringBuilder str1=new StringBuilder();
	 for(String a:str) {
		 str1.append(a);
	 }
	 return str1.toString();
 }
} 
