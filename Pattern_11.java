public class Pattern_11 {
    public static void main(String[] args) {
        int n=5;
        int num=1;
        int start;
        for(int i=0;i<n;i++)
        {
            if(i%2==0) start =1;
            else start=0;
            for(int j=0;j<=i;j++){
                if(start==1){
                    System.out.print(start);
                    start=1-start;
                }
                else if(start==0){
                    System.out.print(start);
                    start=1-start;
                }
                
              
            }
            
            System.out.println();
        }
    }
    
}
