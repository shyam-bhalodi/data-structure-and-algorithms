package strings;

public class kmpPatternMatchingAlgorithm {
    public static void main(String[] args) {
        System.out.println(strStr("leetcode",new String("sad")));
    }

    public static int strStr(String haystack, String needle) {
        int[] lps=new int[needle.length()];
        generateLPS(needle,lps);
//        for(int a:lps)
//            System.out.println(a);
        int n=needle.length(),m=haystack.length(),i=0,j=0;
        while((m-i)>=(n-j)){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }
            if(j==needle.length()){
                return i-j;
            }else if(i<m && haystack.charAt(i)!=needle.charAt(j)){
                if(j!=0)
                    j=lps[j-1];
                else
                    i++;
            }
        }
        return -1;
    }

    private static void generateLPS(String needle, int[] lps) {
        int n=needle.length(),len=0;
        lps[0]=0;
        int i=1;
        while(i<n){
            if(needle.charAt(i)==needle.charAt(len)){
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
