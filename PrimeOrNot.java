public class PrimeOrNot {
    public static void main(String[] args) {
      int n=232;
      boolean prime=true;
      if(n<=1) prime=false;
      for(int i=2;i*i<=n;i++){
         if(n%i==0) prime=false;
         break;

      }
      if(prime) System.out.print("true");
      else System.out.println("false");
        
        
    }
}
