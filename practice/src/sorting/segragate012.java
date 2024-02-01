package sorting;

public class segragate012 {
    public static void main(String[] args) {
        int[] arr=new int[]{1 ,0 ,1 ,2 ,1 ,1 ,0 ,0 ,1 ,2 ,1 ,2 ,1 ,2 ,1 ,0 ,0 ,1 ,1 ,2 ,2 ,0 ,0 ,2 ,2 ,2 ,1 ,1 ,1 ,2 ,0 ,0 ,0 ,2 ,0 ,1 ,1 ,1 ,1 ,0 ,0 ,0 ,2 ,2 ,1 ,2 ,2 ,2 ,0 ,2 ,1 ,1 ,2 ,2 ,0 ,2 ,2 ,1 ,1 ,0 ,0 ,2 ,0 ,2 ,2 ,1 ,0 ,1 ,2 ,0 ,0 ,0 ,0 ,2 ,0 ,2 ,2 ,0 ,2 ,1 ,0 ,0 ,2 ,2};
        segragate012(arr,84);
        for(int a:arr)
            System.out.println(a);
    }

    public static void segragate012(int arr[], int N){
        int start=0,mid=0,high=N-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,start);
                start++;mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
    }

    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
