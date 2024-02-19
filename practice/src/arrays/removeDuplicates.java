package arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr=new int[]{1,1};
        int k=removeDuplicates(arr);
        for(int a: arr)
            System.out.println(a);
    }

    public static int removeDuplicates(int[] nums) {

        int k=0;
        for(int i=1;i<nums.length;++i){
            while(i<nums.length&&nums[i]==nums[k]){
                i++;
            }
            if(i<nums.length)
            {nums[k+1]=nums[i];
            k++;}
        }
        return k+1;
    }
}
