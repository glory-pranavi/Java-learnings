class Sum_N_Rec{
    static void print(int n,int sum){
        if(n==0) {
            System.out.print(sum);
            return;
        }
        print(n-1,sum+n);
    }


public static void main(String[] args) {
    int n=5;
    print(n,0);
}
}