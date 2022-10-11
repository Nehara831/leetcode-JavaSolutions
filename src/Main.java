import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(LengthOfLastWord("Hello world My Kinduyt ui  "));

    }
    public static int LengthOfLastWord(String S){
        String[] result=S.split(" ");
        int r= result[result.length-1].length();
        return r;
    }
}