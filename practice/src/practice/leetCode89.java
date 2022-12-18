package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class leetCode89 {
	public static void main(String[] args) {
		System.out.println(grayCode(2));
	}
	
	public static List<Integer> grayCode(int n) {
        
//		List<Integer> res=new ArrayList<>();
//		for(int i=0;i<(1<<n);++i)
//			res.add(i^(i>>1));
//		return res;
		return IntStream.range(0, 1<<n).mapToObj(e-> e^(e>>1)).collect(Collectors.toList());
		//return null;
    }
}
