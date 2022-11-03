import java.util.HashMap;

public class CountAndSay {
    public static void main(String args[]){
        System.out.println(countAndSay(3322251));

    }
    public static String countAndSay(int n) {
        String nums=String.valueOf(n);
        HashMap<Character,Integer> res=new HashMap<>();
        for(int i=0;i<nums.length();i++){
            if(!res.containsKey(nums.charAt(i)))
                res.put(nums.charAt(i),1);
            else {
                int val=res.get(nums.charAt(i))+1;
                res.put(nums.charAt(i), val);
            }
        }
        String result="";
        for(char key:res.keySet()){
            result=result+key+res.get(key);
        }
    return result;
    }
}
