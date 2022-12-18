package practice;

public class leetcode67 {
	public static void main(String[] args) {
		System.out.println(addBinary("1010", "1011"));
	}
	
	public static String addBinary(String a, String b) {
        int la=a.length()-1;
        int lb=b.length()-1;
        int carry=0;
        StringBuilder str=new StringBuilder();
        while(la>=0 || lb>=0) {
        	int cur=carry+(la>=0? a.charAt(la)-'0':0)+(lb>=0? b.charAt(lb)-'0':0);
        	str.append(cur%2);
        	carry=cur/2;
        	la--;
        	lb--;
        }
        if(carry>0)
        	str.append(carry);
        return str.reverse().toString();
    }
	
}
