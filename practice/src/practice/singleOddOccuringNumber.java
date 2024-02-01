package practice;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class singleOddOccuringNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(singleNumber(new int[] {4,1,2,1,2}));
	}
	
	 public static int singleNumber(int[] nums) {
	    Arrays.binarySearch(nums,1);
		return  Arrays.stream(nums).reduce(0,(a,b)->a^b);
	    }

}
