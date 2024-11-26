import java.util.ArrayList;

public class decToBinnary {
    public static void main(String[] args) {
        int n=2000;
        ArrayList<Integer> ans = new ArrayList<>();
        while(n>0){
            int r=n%2;
            ans.add(r);
            n/=2;
        }
//        System.out.println(ans);
        for( int e : ans){
            System.out.print(e+" ");
        }
    }
}
