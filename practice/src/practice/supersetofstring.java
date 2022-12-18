package practice;

public class supersetofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superSet("abc",0,new String());
	}
	
	public static void superSet(String s,int pos,String cur) {
		if(pos==s.length()) {
			System.out.println(cur);
			return;}
		superSet(s,pos+1,cur);
		superSet(s,pos+1,cur+s.charAt(pos));
		
	}

}
