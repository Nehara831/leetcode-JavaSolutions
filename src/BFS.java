import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class BFS {
    public static void main(String args[]){
        ArrayList<Integer> res=new ArrayList<>();
        ArrayList<Integer> a0=new ArrayList<>();
        a0.add(1);
        a0.add(2);
        a0.add(4);
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(0);
        a1.add(3);
        ArrayList<Integer> a2=new ArrayList<>();
        a2.add(3);
        a2.add(5);
        ArrayList<Integer> a3=new ArrayList<>();
        a3.add(1);
        a3.add(2);
        ArrayList<Integer> a4=new ArrayList<>();
        a4.add(0);
        a4.add(6);
        ArrayList<Integer> a5=new ArrayList<>();
        a5.add(2);
        a5.add(6);
        ArrayList<Integer> a6=new ArrayList<>();
        a6.add(4);
        a6.add(5);


        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        adj.add(a0);
        adj.add(a1);
        adj.add(a2);
        adj.add(a3);
        adj.add(a4);
        adj.add(a5);
        adj.add(a6);
        res=bfsOfGraph(7,adj);
        for(int i=0;i<res.size();i++)
            System.out.print(res.get(i)+" ");


    }
    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        int curr;
        boolean[] check=new boolean[V];
        Arrays.fill(check,false);
        ArrayList<Integer> result=new ArrayList<>();
        result.add(0);
        Queue<Integer> que=new PriorityQueue<>();
        que.add(0);
        check[0]=true;
        while(!que.isEmpty()){
            ArrayList<Integer> current=new ArrayList<>();
            curr=que.remove();
            current=adj.get(curr);
            for(int j=0;j<current.size();j++){
                if(!check[current.get(j)])
                {
                    que.add(current.get(j));
                    result.add(current.get(j));
                    check[current.get(j)]=true;
                }
            }
        }
    return result;
    }
}
