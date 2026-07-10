public class Logic_Building_2_1 {
    public static void main(String[] args) {
        int x=-12344;
        
       String s= String.valueOf(x);
        String ans="";
        if(s.charAt(0)=='-') ans+='-';
       for(int i=s.length()-1;i>=0;i--){
                if(s.charAt(i)!='-' && s.charAt(i)!='0') ans+=s.charAt(i);
            }
        
        int d=Integer.valueOf(ans);
        System.out.print(d);
        }
    }
