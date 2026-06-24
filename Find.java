public class Find {
    class Solution {
    public int whileLoop(int d) {
        
        
        int sum=d;
        int n=1;
        int x=d;
        while(n<50)
        {
            sum=sum+10;
             x=x+sum;

             n++;
                
        }
        return x;
    }
}
}
