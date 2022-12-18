package practice;

public class swapOddEvenBits {

	public static void main(String[] args) {
		System.out.println(swapBits(23));
	}
	
	 public static int swapBits(int n) 
	    {
		 	int i_bit,i_1_bit;
		 	for(int i=0;i<32;i+=2) {
		 		i_bit=(n>>i)&1;
		 		i_1_bit=(n>>(i+1))&1;
		 		n=n-(i_bit<<i)-(i_1_bit<<(i+1))+(i_bit<<(i+1))+(i_1_bit<<i);
		 	}
			return n;
		}

}
