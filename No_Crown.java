public class No_Crown {
    public static void main(String[] args) {
        int n=3;
        int num2=1;
        for(int i=0;i<n;i++){
            int num=1;
            for(int k=0;k<=i;k++){
                System.out.print(num);
                num2=num;
                num++;
            }
            for(int j=0;j<((n*2)-(2+i))-i;j++){
                System.out.print(" ");
            }
            for(int h=0;h<=i;h++){
                System.out.print(num2);
                num2--;
                
                
            }
            num++;
            System.out.println();
            
        }
    }
    
}
