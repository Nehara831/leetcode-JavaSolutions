import java.util.Scanner;

public class PrimeDifferences {
    public static void main(String args[]) {
        PrimeDifference();
    }

        public static void PrimeDifference (){
            Scanner scanner = new Scanner(System.in);
            int no = scanner.nextInt();
            for (int i = 0; i < no; i++) {
                Scanner sc = new Scanner(System.in);
                String[] input = (sc.nextLine()).split(" ");
                int high = Math.max(Integer.valueOf(input[0]), Integer.valueOf(input[1]));
                int low = Math.min(Integer.valueOf(input[0]), Integer.valueOf(input[1]));
                while (low < high) {
                    if (ChechPrime(low) && ChechPrime(high))
                        break;
                    else if (ChechPrime(low) && !ChechPrime(high))
                        high--;
                    else low++;
                }
                if (high == low)
                    System.out.println(0);
                else System.out.println(high - low);
            }
    }
            public static boolean ChechPrime ( int val){
                boolean flag = true;
                for (int n = 2; n < val; n++) {
                    if (val % n == 0)
                        flag = false;
                }
                return flag;
            }

        }











