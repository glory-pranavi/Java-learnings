public class Recursion_2 {
    static  void print1(int i,int n){
         if(i>n) return;
         System.out.println(i);
         print1(i+1, n);
    }
    public static void main(String[] args) {
       
        int n=5;
        print1(1, n);
        

    }
    
    
}

    

