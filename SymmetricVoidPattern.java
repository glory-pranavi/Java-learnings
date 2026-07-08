public class SymmetricVoidPattern {
    public static void main(String[] args) {
        int n= 3;
        for(int i=0;i<n;i++){
            for(int k=0;k<(n*2-i*2)/2;k++){
                System.out.print("*");
            }
            for(int j=0;j<i*2;j++){
                System.out.print(" ");

            }
             for(int k=0;k<(n*2-i*2)/2;k++){
                System.out.print("*");
            }
            System.out.println();
            
        }

         for(int i=0;i<n;i++){
            for(int k=0;k<((i*2)+2)/2;k++){
                System.out.print("*");
            }
            for(int j=0;j<((n*2)-2)-i*2;j++){
                System.out.print(" ");

            }
             for(int k=0;k<((i*2)+2)/2;k++){
                System.out.print("*");
            }
            System.out.println();
            
        }

    }
    
}
