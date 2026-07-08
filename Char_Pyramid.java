public class Char_Pyramid {
    public static void main(String[] args) {
        int n=3;
        for(int i=0;i<n;i++){
            char s='A';
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(s);
                s++;
        
            }
           s--;
           for(int l=0;l<i;l++){
            s--;
               System.out.print(s);
        }
            


            System.out.println();
        }
    }
}
