public class KadanesAlgorhythm {
    public static void main(String[] args){
        int[] sum={-1,-1,-5,-6};
        System.out.println(ReturnMaxSum(sum));
    }
    public static int ReturnMaxSum(int[] nums){
        int pre_sum=nums[0];
        int curr_sum=0;
        for(int i=0;i<nums.length;i++){
            curr_sum=curr_sum+nums[i];
            if(curr_sum>=pre_sum)
                pre_sum=curr_sum;
            if(curr_sum<0)
                curr_sum=0;
        }
        return pre_sum;
    }

}
