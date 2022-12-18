package practice;

import java.util.Arrays;

public class backtrackingMaxNoByKSwaps {
	static String max;
	public static void main(String[] args) {
		String s="61892795431";
		max=s;
		System.out.println(findMaximumNum(s, 4));
	}
	

	public static String findMaximumNum(String s,int k) {
		max=s;
		helper(s.toCharArray(),k);
		return max;
		
	}
	
	public static void helper(char[] s,int k) {
		if(String.valueOf(s).compareTo(max)>0)
			max=String.valueOf(s);
		if(k==0)
			return;
		for(int i=0;i<s.length-1;++i)
			for(int j=i+1;j<s.length;++j)
			{
				if(s[j]>s[i]) {
					char temp=s[i];
					s[i]=s[j];
					s[j]=temp;
					helper(s,k-1);
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
	}
}

