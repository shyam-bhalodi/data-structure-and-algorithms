package strings;

import java.util.Arrays;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] arr=new String[]{"",""};
        System.out.println(longestCommonPrefix(arr));
        //Arrays.sort(arr);
        //Arrays.stream(arr).forEach(e->System.out.println(e));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        Arrays.sort(strs);
        int length=Math.min(strs[0].length(),strs[strs.length-1].length());
        String first=strs[0];
        String last=strs[strs.length-1];
        StringBuilder res=new StringBuilder();
        for(int i=0;i<length;++i){
            if(first.charAt(i)!=last.charAt(i)){
                return res.toString();
            }
            res.append(strs[0].charAt(i));
        }
        return res.toString();
    }
}
