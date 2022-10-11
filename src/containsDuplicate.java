import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class containsDuplicate {
    public static void main(String [] args){
        int[] arr={1,2,3,5};
        System.out.println(containsDuplicate(arr));

    }
    public static boolean containsDuplicate(int[] nums){
        boolean flag=false;
//        List<Integer>checkList=new ArrayList<>();
//        checkList.add(nums[0]);
//        for(int i=1;i<nums.length;i++){
//            if(!checkList.contains(nums[i])){
//                checkList.add(nums[i]);
//            }
//            else {
//                flag=true;
//
//            break;}
//        }
//        return flag;
        Map<Integer,Boolean> hashm=new HashMap<>();
        for(int num:nums){
            if(hashm.containsKey(num)){
                return true;
            }
            hashm.put(num,true);

        }
        return flag;
    }
}
