
import java.util.ArrayList;

public class ZigZagConversion {
    public static void main(String args[]){
        System.out.println(convert("A",3));

    }
    public static String convert(String s, int numRows) {
        ArrayList<String> ArrayL= new ArrayList<>();
        ArrayL.add("");
        boolean flag=true;
        int count=1;
        int position=0;
        while(position<s.length()){
            String ss="";
            ArrayL.add(ss);
            if(!ArrayL.isEmpty())
                ss=ArrayL.get(count)+s.charAt(position);
            else ss=ss+s.charAt(position);
            ArrayL.set(count,ss);
            if((count)==numRows)
                flag=false;
            if(count==1)
                flag=true;
            if (flag)
                count++;
            else count--;
            position++;
        }
        String result="";
        for(int i=0;i<ArrayL.size();i++)
            result=result+ArrayL.get(i);
        return result;
//
    }
}
