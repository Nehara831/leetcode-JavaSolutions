import java.util.ArrayList;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Queue;

public class FirstUniqueCharacter {
    public static void main(String args[]){
        System.out.println(firstUniqChar("aabcghjlkjg"));

    }
    public static int firstUniqChar(String s) {
        if(s.length()==1)
            return 0;
        String [] ss=s.split("");
        int low=0;
        int high=ss.length-1;
        while(low<=ss.length-1 && high>=0){
            if(ss[high].equals(ss[low])&& low!=high){
                low++;
                high=ss.length-1;
            }
            else
                high--;
        }
        if(low<ss.length)
            if(low>ss.length-1)
                return high;
            else
                return low;
        else
            return -1;

    }
}
