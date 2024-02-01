package sorting;

public class kthSmallestElement {
    public static void main(String[] args) {
        System.out.println(kthSmallest(new int[]{3,5,4,2,9},5,3));
    }

    public static int kthSmallest(int arr[], int n, int k)
    {
        int low =0,high=n-1;
        while(low<=high){
            int p=partition(arr,low,high);
            if(p==(k-1)){
                return arr[p];
            }else if((k-1)>p){
                low=p+1;
            }else{
                high=p-1;
            }
        }
    return -1;
    }

    static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int start=low-1;
        for(int i=low;i<=(high-1);++i){
            if(arr[i]<pivot)
            { start++;
            swap(arr,start,i);}
        }
        swap(arr,start+1,high);
        return start+1;
    }

    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
