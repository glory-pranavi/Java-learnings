public class IncreasingLetterTrianglePattern {
    public static void main(String[] args) {
        int n=3;
        for(int i=0;i<n;i++){
            char start='A';
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start++;
            }
            System.out.println(" ");
        }
    }
    
}
