public class searchValArray {
    public static int SearchValOfArray(int[] arr, int target){
          for(int i=0; i<5;i++){
            if(arr[i]==target){
                System.out.println(i);
            }
          }
          return 0;
    }
    public static void main(String[] args) {
       int arr[]={3,5,7,2,4};
       int target=7;
       SearchValOfArray(arr, target);
    }
}
