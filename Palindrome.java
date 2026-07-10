public class Palindrome {
    public static void main(String[] args) {
        int n=121;
        String ans="";
        String s= String.valueOf(n);
        for(int i=s.length()-1;i>=0;i--){
            ans+=s.charAt(i);
        }
        int d=Integer.valueOf(ans);
        if(d==n){
            System.out.println("palindrome");

        }
        else
             System.out.print(" not palindrome");
    }
}
