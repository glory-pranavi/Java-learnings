public class ButterFlyPattern {
    public static void main(String[] args) {
        int n=3;
      for(int i=0;i<n;i++){
        for(int j=0;j<((i*2)+2)/2;j++){
            System.out.print("*");
        }
        for(int k=0;k<((n*2)-2)-2*i;k++){
            System.out.print(" ");
        }
        for(int j1=0;j1<((i*2)+2)/2;j1++){
            System.out.print("*");
        }
        System.out.println();
      }

      for(int i=0;i<n-1;i++){
        for(int k=0;k<(((n*2)-2)-i*2)/2;k++){
            System.out.print("*");
        }
        for(int j=0;j<(i*2)+2;j++){
            System.out.print(" ");
        }
        for(int k1=0;k1<(((n*2)-2)-i*2)/2;k1++){
            System.out.print("*");
        }
        System.out.println();

      }
    }
    
}
