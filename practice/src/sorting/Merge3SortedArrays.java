package sorting;

import java.util.ArrayList;

public class Merge3SortedArrays {
    public static void main(String[] args) {
        ArrayList<Integer> res=merge3sorted(new int[]{1 ,2,3,4},new int[]{1,2,3,4,5},new int[]{1,2,3,4,5,6});
        System.out.println(res);
    }

    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
    {
        ArrayList<Integer> res=new ArrayList<>();

        int i=0,j=0,k=0;
        int n=A.length,m=B.length,p=C.length;

        while(i<n || j<m || k<p){
            int a=Integer.MAX_VALUE;
            int b=Integer.MAX_VALUE;
            int c=Integer.MAX_VALUE;
            if(i<n){
                a=A[i];
            }
            if(j<m){
                b=B[j];
            }
            if(k<p){
                c=C[k];
            }

            if(a<=b && a<=c){
                res.add(a);i++;
            }else if(b<=a && b<=c){
                res.add(b);j++;
            }else if(c<=b && c<=a){
                res.add(c);k++;
            }
        }

        return res;
    }
}
