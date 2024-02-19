package strings;

public class repeatedSubstringPattern {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int[] lps = new int[s.length()];
        int n=s.length();
        computeLPS(s,lps);
        int len=lps[n-1];
        return (len>0 && (n%(n-len))==0);
    }

    public static void computeLPS(String s, int[] lps){
        int n=s.length(),i=1,len=0;
        lps[0]=0;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len==0){
                    lps[i]=0;
                    i++;
                }else{
                    len=lps[len-1];
                }
            }
        }
    }
}
