package sorting;

public class ThreeWayParttitioning {

    public static void main(String[] args) {
        int[] array=new int[]{1, 2, 3, 3, 4};
        threeWayPartition(array,1,2);
        for(int a:array)
            System.out.println(a);
    }
    public static void threeWayPartition(int array[], int a, int b)
    {
        int start=0,mid=0,end=array.length-1;
        while(mid<=end){
            if(array[mid]<a){
                int temp=array[start];
                array[start]=array[mid];
                array[mid]=temp;
                start++;mid++;
            }else if(array[mid]>=a && array[mid]<=b){
                mid++;
            }else if(array[mid]>b){
                int temp=array[mid];
                array[mid]=array[end];
                array[end]=temp;
                end--;
            }
        }
    }
}
