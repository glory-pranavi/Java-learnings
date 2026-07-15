
import java.util.ArrayList;
import java.util.Collections;

public class DivisorsOfANumber {
    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        int n=36;
        for(int i=1;i*i<=n;i++){
             if(n%i==0){
                a.add(i);
             }
            if(i!=n/i) a.add(n/i);
        }
        Collections.sort(a);
        System.out.print(a);
    }
}
