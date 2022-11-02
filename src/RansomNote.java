import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RansomNote {
    public static void main(String args[]){
        System.out.println(canConstruct("aa","aab"));

    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        List<Character> checkList=new ArrayList<>();
        for(int i=0;i<ransomNote.length();i++){
            checkList.add(ransomNote.charAt(i));
        }
        for(int i=0;i<magazine.length();i++){
            if(!checkList.isEmpty()) {
                char a=magazine.charAt(i);
                if (checkList.contains(a))
                    checkList.remove(checkList.indexOf(a));
            }
            else break;
        }
        if(checkList.isEmpty())
            return true;
        return false;
    }
}
