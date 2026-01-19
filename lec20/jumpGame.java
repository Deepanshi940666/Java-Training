

public class jumpGame{
public static boolean canJump(int[] nums) {

        int maxR=0;
        for(int i=0;i<nums.length; i++){
           if(i>maxR){
            return false;
           }
           maxR=Math.max(maxR,i+nums[i]);
        }
        return true;

    }

public static void main(String[] args) {
      int nums[]={1,2,2,1,1};
       System.out.println(canJump( nums));
}

}



