public class Recursion_4 {
    static  void print1(int i,int n){
         if(i<1) return;
         print1(i-1, n);
         System.out.println(i);
    }
    public static void main(String[] args) {
       
        int n=5;
        print1(n, n);
        

    }
}
    