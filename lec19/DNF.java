package lec19;

public class DNF {
    static void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        int arr[]={1,0,2,0,1};
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
           else{
                swap(arr,mid,high);
                high--;
            }
        }

        for(int x: arr){
            System.out.print(x+" ");
        }
    }

}
