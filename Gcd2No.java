public class Gcd2No {
    public static void main(String[] args) {
        //or read two values and take a as max of 2 values ,
        // take b as min of 2 values.
        int a=23;
        int b=17;
        while (b!=0) { 
              int temp=b;
              b=a%b;
              a=temp;
        }
        System.out.print(a);
    }
    
}
