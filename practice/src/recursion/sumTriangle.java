package recursion;

import java.util.Arrays;

public class sumTriangle {
    public static void main(String[] args) {
        triangle(new int[]{1, 2, 3, 4, 5});
    }

    static void triangle(int[] a){
        if(a.length<1){
            //System.out.println(Arrays.toString(a));
            return;
        }
        int b[]=new int[a.length-1];
        for(int i=0;i<a.length-1;++i){
            b[i]=a[i]+a[i+1];
        }
        triangle(b);
        System.out.println(Arrays.toString(a));
    }
}
