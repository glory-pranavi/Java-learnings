
import java.util.Arrays;

public class Rev_Array_Rec {
    static void p(int a[],int n,int i){
      if(i==0) {
        
       // System.out.print(a[0]);
        return;
      }
      System.out.println( a[i-1]);
      p(a,n,i-1);

    }

    public static void main(String[] args) {
        int a[]={20,10,50,14};
        Arrays.sort(a);
        p(a,4,4);
    }
}
