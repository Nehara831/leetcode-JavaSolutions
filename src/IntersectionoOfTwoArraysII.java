import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionoOfTwoArraysII {
    public static void main(String[] args) {
        int[] nums1={3,1,2};
        int[]nums2={1,1};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] mins = nums1;
        int[] maxs = nums2;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        if (nums2.length < nums1.length) {
            mins = nums2;
            maxs = nums1;
        }
        for (int max : maxs) {
            arrayList.add(max);
        }
        for (int min : mins) {
            if (arrayList.contains(min)) {

                res.add(min);
                arrayList.remove(Integer.valueOf(min));
            }
        }
        int [] ints = res.stream().mapToInt(Integer::intValue).toArray();
        return ints;
    }
}
