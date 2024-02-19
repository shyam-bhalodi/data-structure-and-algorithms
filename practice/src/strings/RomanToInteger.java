package strings;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt(new String("MCMXCIV")));
    }

    static int valuesInInt(Character s){
        switch (s){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
    public static int romanToInt(String s) {
        int res=0;
        for(int i=0;i<s.length();++i){
            int s1=valuesInInt(s.charAt(i));
            if(i+1<(s.length())){
                int s2=valuesInInt(s.charAt(i+1));
                if(s1<s2){
                    res+=s2-s1;
                    i++;
                }else{
                    res+=s1;
                }
            }else{
                res+=s1;
            }
        }
        return res;
    }
}
