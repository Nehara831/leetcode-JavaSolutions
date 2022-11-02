import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

//public class largestComponent {
//    public static void main(String args[]){
////int[][] adj={{6,5},{2,4,6},{1,3},{2,6},{1,6,5},{4,0},{3,1,4,0}};
////largestComponent(adj);
////        }
//
//    public static void largestComponent(int[][] adj) {
//        Queue<Integer> que = new PriorityQueue<>();
//        que.add(0);
//
//        boolean[] check = new boolean[adj.length];
//        boolean flag = true;
//
//        Arrays.fill(check, false);
//        System.out.println(0);
//        int count = 0;
//        while (flag){
//
//            while (!que.isEmpty()) {
//                int current = que.peek();
//                if (!check[current]) {
//
//                    check[current] = true;
//                }
//                for (int neighbor : adj[current]) {
//                    if (!check[neighbor]) {
//                        check[neighbor] = true;
//                        System.out.println(neighbor);
//                        que.add(neighbor);
//                    }
//                }
//                que.remove();
//            }
//    }
//        if(Arrays.asList(check).contains(false))
//
//
//
//
//    }
//}
//
