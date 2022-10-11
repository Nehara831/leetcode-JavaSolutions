import java.util.*;
import java.lang.*;


public class PlusOne {

    public static void main(String []args){
        int[] nums={9,9,9};
        int[] res1=plusOne(nums);
        for(int re:res1)
        System.out.print(re);
    }
    public static int[] plusOne(int[] digits){
        int[] arr=new int[digits.length+1];
        arr[0]=1;











        if(digits[digits.length-1]!=9){
            digits[digits.length-1]=digits[digits.length-1]+1;
        }
        else{
            List<Integer> ArrayLis=new ArrayList<>();
            int i=digits.length-1;
            while(true){
                digits[i]=0;
                int l=i-digits.length-2;
                arr[l]=0;

                ArrayLis.add(0);
                if(i!=0)
                i--;
                else{
                    if (digits[i] == 0) {
                         ArrayLis.add(0,1);
                        int [] ints = ArrayLis.stream().mapToInt(Integer::intValue).toArray();
                        return ints;
                    }
                }
                if(digits[i]!=9){
                    digits[i]=digits[i]+1;
                    break;
                }

            }
        }
        return digits;
    }
}
