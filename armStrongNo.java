public class armStrongNo {
    public static void main(String[] args) {
        //arm strong number 153= 1^3 + 5^3 + 3^3=153;
        int n=153;
        String s= String.valueOf(n);
        int sum=0;
        int v;
        int n1=s.length();
        for(int i=0;i<n1;i++){
            char ch=s.charAt(i);
            int x=ch-'0';
            v=(int)Math.pow(x,n1);
            sum+=v;

        }
        System.out.println(sum);
    }
}
