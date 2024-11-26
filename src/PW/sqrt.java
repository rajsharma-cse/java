package PW;

public class sqrt {
    public static int Sqrt(int x){
        long lo=0,hi=(long)x;
        while (lo<=hi){
            long mid = lo + (hi - lo)/2;
            if(mid*mid == (long) x){
                return (int)mid;
            }else if(mid*mid > (long)x ){
                hi = mid -1;
            }else {
                lo = mid+1;
            }
        }
        return (int)hi;
    }

    public static void main(String[] args) {
//        int x=16;
        System.out.println(Sqrt(15));
    }
}
