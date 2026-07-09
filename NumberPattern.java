public class NumberPattern {
    public static void main(String[] args) {
        int n=3;
        for(int i=0;i<n*2-1;i++){
            for(int j=0;j<n*2-1;j++){
                if(i==0 || i==n*2-2|| j==0|| j==n*2-2){
                    System.out.print(n);
                }
                else if(j==1||i==1||i==n||j==n ){
                    System.out.print(n-1);
                }
                else {
                    System.out.print(n-2);
                }
            }
            System.out.println();
        }
    }
    
}
