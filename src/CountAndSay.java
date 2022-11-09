import java.util.*;

public class CountAndSay {
    public static void main(String args[]){
        long start = System.nanoTime();
        //System.out.println(countAndSay(6));
        System.out.println(countAndSay_LOOP(6));
        long end = System.nanoTime();
        // execution time
        long execution = (end - start);
        System.out.println("Execution time: " + execution*Math.pow(10,6) + " miliseconds");
    }
    static String res="1";
    static int i=1;
public static String countAndSay(int n){
    if(i==n)
        return res;
    String resul="1"+res.charAt(0);
    for(int i=1;i<res.length();i++){
        if(Objects.equals(res.charAt(i), res.charAt(i -1))){
            resul=resul.substring(0,resul.length()-2)+Integer.toString(Integer.parseInt(String.valueOf(resul.charAt(resul.length()-2)))+1)+resul.charAt(resul.length()-1);
        } else
            resul=resul+Integer.toString(1)+res.charAt(i);
    }
    res=resul;
    i++;
    res=countAndSay(n);
    return res;

}
    public static String countAndSay_LOOP(int n){
         String res="1";
         int i;
    for( i=1;i<n;i++) {
        String resul = "1" + res.charAt(0);

        for (int j = 1; j < res.length(); j++) {
            if (Objects.equals(res.charAt(j), res.charAt(j - 1))) {
                resul = resul.substring(0, resul.length() - 2) + Integer.toString(Integer.parseInt(String.valueOf(resul.charAt(resul.length() - 2))) + 1) + resul.charAt(resul.length() - 1);
            } else
                resul = resul + Integer.toString(1) + res.charAt(j);
        }
        res = resul;
    }
        return res;
    }
}
