public class Recursion_3 {
    static  void print1(int i,int n){
         if(n<i) return;
         System.out.println(n);
         print1(i, n-1);
    }
    public static void main(String[] args) {
       
        int n=5;
        print1(1, n);
        

    }
}
    