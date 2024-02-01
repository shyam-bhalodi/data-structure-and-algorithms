package sorting;

import java.util.Arrays;

public class mergeWithoutExtraSpace {
    public static void main(String[] args) {
        long arr1[]=new long[]{1 ,3 ,5 ,7};
        long arr2[]=new long[]{0 ,2 ,6 ,8 ,9};
        merge(arr1,arr2,4,5);
        for(long a:arr1)
            System.out.println(a);
        for(long a:arr2)
            System.out.println(a);
    }

    public static void merge(long arr1[], long arr2[], int n, int m)
    {
        int i=n-1,j=0;
        while(i>=0 && j<m){
            if(arr1[i]>arr2[j]){
                long temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
            }
            i--;j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
