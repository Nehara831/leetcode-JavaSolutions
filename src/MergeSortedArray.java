import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args){
        int[] nums1={1,2,3,0,0,0};
        int m=3;
        int[] nums2={2,5,6};
        int n=nums2.length;
        System.out.println(Arrays.toString(merge(nums1,m,nums2,n)));
        //merge(nums1,m,nums2,n);
    }
    public static  int[] merge(int[]nums1,int m,int[]nums2,int n){
        int current;
        int j=0;
        for(int i=0;i<m;i++) {
            current = nums1[i];
            if (i < m ){
                if (nums2[0] < current) {
                    nums1[i] = nums2[0];
                    nums2[0] = current;
                    Arrays.sort(nums2);
                }
        }
            else{
                nums1[i]=nums2[j];
                j++;
            }
        }
    return nums1;
    }
}
