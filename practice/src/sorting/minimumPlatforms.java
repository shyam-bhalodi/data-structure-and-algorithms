package sorting;

import java.util.Arrays;

public class minimumPlatforms {
    public static void main(String[] args) {
        int arr[] = {900, 1100, 1235};
        int dep[] = {1000, 1200, 1240};
        System.out.println(findPlatform(arr,dep,3));
    }

    static int findPlatform(int arr[], int dep[], int n)
    {
        int ans=0,count=0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0,j=0;
        while(i<n && j<n){
            if(arr[i]>dep[j]){
                j++;count--;
            }else{
                i++;count++;
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}
