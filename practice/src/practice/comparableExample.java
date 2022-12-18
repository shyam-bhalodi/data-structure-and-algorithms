package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparableExample {

	public class emp implements Comparable<emp>{
		public int id;
		public String name;
		
		public int compareTo(emp o) {
			
				if(this.id>o.id) {
					return 1;
				}
				else
					return -1;
			
			
		}
	}
	
	public static void main(String[] args) {
		comparableExample c1=new comparableExample();
		List<emp> eList=new ArrayList<emp>();
		emp e1=c1.new emp();
		e1.id=1;
		e1.name="Rahul";
		emp e2=c1.new emp();
		e2.id=2;
		e2.name="Ram";
		eList.add(e2);
		eList.add(e1);
		Collections.sort(eList);
		System.out.println("data: "+eList.toString());
	}
}
