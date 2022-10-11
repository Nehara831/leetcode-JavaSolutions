public class MaximumSubarray {
    static int count=0;
    static int i=0;
    static int toBeChecked=i+1;
    static int sum=0,max=0;
    public static void main(String []args){
        int[] sumarr={1,-1,1};
        System.out.println(MaximumSum(sumarr));
    }

    public static int MaximumSum(int[]nums){
        int bottom=0;
        int top=nums.length -1;
        int max=nums[0];
        int sum2=bottom;
        int sum3=top;
        while((bottom<nums.length)&&(top>0)) {
            int sum=0;
            for (int i = bottom; i <= top; i++) {
                sum=sum+nums[i];
                if(sum>=max){
                    max=sum;
                }
            }
//            if(bottom>top){
//                sum=max;
//            }
            if(sum>=max){
                max=sum;
            }
            if(nums[top]>nums[bottom])
                bottom++;
            else if(nums[top]<nums[bottom])
                top--;
            else if(nums[bottom]==nums[top]&& bottom!=top){
                while(nums[top]==nums[bottom]){
                    if(nums[top-1]<nums[bottom+1])
                        top--;
                    else if(nums[top-1]>nums[bottom+1])bottom++;
                    else{
                        top--;
                        bottom++;
                    }
                }
            }
            else{
                break;
            }




        }
        return max;
    }
}

