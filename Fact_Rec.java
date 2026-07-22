public class Fact_Rec {
    static int print(int n){
        if(n==1) return 1;
        
        
        //System.out.println(sum);
       return n* print(n-1);
         
    }
    public static void main(String[] args) {
        
        int n=5;
        System.out.println(print(n));
    }
}
