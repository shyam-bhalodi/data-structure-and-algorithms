package practice;

public class apowerb {

	public static void main(String[] args) {
		System.out.println(power(4, 4));
	}
	
	public static int power(int a,int b) {
		int res =0;
		if(b==0)
			return 1;
		if((b&1)!=0)
			res=power(a,b-1)*a;
		res=a*a*power(a,b>>2);
		return res;
	}

}
