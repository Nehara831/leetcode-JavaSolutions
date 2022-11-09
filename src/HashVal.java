import java.util.*;

public class HashVal {
    public static void main(String args[]) {
        long start = System.nanoTime();
        System.out.println(permutations("university"));
        long end = System.nanoTime();
        // execution time
        long execution = (end - start);
        System.out.println("Execution time: " + execution*Math.pow(10,-9) + " nanoseconds");
    }
    public static int permutations(String ss){
        ArrayList<String> res=new ArrayList<>();
        Queue<String>que=new PriorityQueue<>();
        Map<String, Integer> check=new HashMap<>();
        Map<Integer,Integer> hashCheck=new HashMap<>();
        hashCheck.put(generateHashval(ss),1);
        que.add(ss);
        check.put(ss,1);
        res.add(ss);
        while(!que.isEmpty()){
            String current= que.peek();
            que.remove();
            for(int i=current.length()-1;i>0;i--){
                char swap=current.charAt(i);
                StringBuilder cu=new StringBuilder();
                cu= new StringBuilder(current);
                cu.setCharAt(i, cu.charAt(i-1));
                cu.setCharAt(i-1,swap);
                String curr= String.valueOf(cu);
                if(!check.containsKey(curr)) {
                        que.add(curr);
                        res.add(curr);
                        check.put(curr,1);
                        int hashVal=generateHashval(curr);
                        hashCheck.put(hashVal,1);

                }
            }
        }
        return res.size()-hashCheck.size();
    }
    public static int generateHashval(String ss){
        int hashSum=0;
        for(int i=0;i<ss.length();i++){
            int ascii=ss.charAt(i);
            hashSum=hashSum+ascii*(int)Math.pow(5,i);
        }
        return (int) (hashSum%(Math.pow(10,ss.length())));
    }
    }


