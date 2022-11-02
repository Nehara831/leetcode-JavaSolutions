public class LandingAirplane {
    public static void main(String args[]){
        System.out.println(LandingAirplane(1));
    }
    static int count=0;
    static int target=5;
    static int val=1;
    public static int LandingAirplane(int input){
        if(input>target){
            return count;
        }
        if(input==target){
            count++;
            return count;
        }
        int val1=input+1;
        int val2=input+2;
        LandingAirplane(val1);
        LandingAirplane(val2);
        return count;

    }
}
