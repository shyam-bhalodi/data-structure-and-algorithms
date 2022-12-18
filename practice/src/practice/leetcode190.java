package practice;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class leetcode190 {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
	System.out.println(java.util.Date
		      .from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
	}
	
	public int reverseBits(int n) {
        int res=0;
        for(int i=0;i<32;++i) {
        	int d=n&1;
        	n=n>>>1;
        	res<<=1;
        	res|=d;
        }
        return res;
    }
}
