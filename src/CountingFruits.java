import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CountingFruits {

    public static void main(String[] args) {
        ArrayList<String []>FruitLines=new ArrayList<>();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number oof runs");
        int inputs=scanner.nextInt();
        for(int input=0;input<inputs;input++){

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the line");
            String in=sc.nextLine();


            //String in2=in.substring(1);
            String[] fruits=in.split(" ");
            FruitLines.add(fruits);}
        for(String[] fruits:FruitLines){
            HashMap<String,Integer> fruitCount=new HashMap<String,Integer>();
            int count=0;

            for(String fruit:fruits){
                if (!fruitCount.containsKey(fruit))
                    fruitCount.put(fruit,1);
                else
                    fruitCount.put(fruit,fruitCount.get(fruit)+1);
            }
            for(String i: fruitCount.keySet()){
                if(fruitCount.get(i)>1) {
                    System.out.print(i + " " + fruitCount.get(i) + " ");
                    count++;
                }
            }

            System.out.println(count);
        }
    }

    }


