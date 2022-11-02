import java.util.Arrays;

public class FindFirstandLastPosition {
    public static void main(String args[]){
        int[] nums={5,7,7,8,10};
        int target=8;
        System.out.println(Arrays.toString(searchRange(nums,target)));


    }
    public static int[] searchRange(int[] nums, int target) {
        boolean flag=true;
        int[] result=new int[2];
        int small=0;
        int large= nums.length-1;
        while(small<=large){
            if(nums[small]==target && nums[large]!=target){
                large--;
            }
            else if(nums[large]==target && nums[small]!=target)
                small++;
            else if(nums[small]==target&& nums[large]==target){
                result[0]=small;
                result[1]=large;
                flag=false;
                break;
            }
            else {
                small++;
                large--;
            }
        }
        if(flag)
        { result[0]=-1;
        result[1]=-1;
        }
    return result;
    }
}
