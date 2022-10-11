import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class PlusOneRecursion {
//    static ArrayList<Integer> ArrayLis=new ArrayList<>();
//    public static void main(String [] args){
//        int[]digits={4,9};
//        int i=digits.length-1;
//        int[] result=PlusOneRecursion(digits,i);
//        System.out.println(Arrays.toString(result));
//    }
//
//    public static int[] PlusOneRecursion(int[] digits,int i){
//        if(i==0 &&digits[i]==9){
//            ArrayLis.add(0,1);
//            ArrayLis.add(0);
//            int [] ints = ArrayLis.stream().mapToInt(Integer::intValue).toArray();
//            return ints;
//        }
//        else if(i>0 && digits[i]!=9){
//            digits[i]=digits[i]+1;
//            return digits;
//        }
//
//        else {
//            ArrayLis.add(0);
//            //ints = ArrayLis.stream().mapToInt(Integer::intValue).toArray();
//            digits[i] = 0;
//
//            if (i > 0)
//                PlusOneRecursion(digits, i - 1);
//
//        }
//        return ints;
//
//    }
//}
