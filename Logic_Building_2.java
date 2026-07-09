public class Logic_Building_2 {
    public static void main(String[] args) {
        int n=12345;
        String ans="";
        String s= String.valueOf(n);
        for(int i=s.length()-1;i>=0;i--){
             ans+=s.charAt(i);
        }
        int d=Integer.valueOf(ans);
        System.out.print(d);
    }
}
