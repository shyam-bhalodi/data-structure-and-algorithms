package sorting;

public class CountingSort {
    public static void main(String[] args) {
        System.out.println(countSort("geeks"));
    }

    public static String countSort(String arr)
    {
        // code here
        int[] count=new int[26];
        for(int i=0;i<26;++i){
            count[i]=0;
        }
        for(char a :arr.toCharArray())
            count[a-'a']++;
        for(int i=1;i<26;++i)
            count[i]+=count[i-1];
        char[] array=arr.toCharArray();
        char[] output=new char[arr.length()];
        for(int i=arr.length()-1;i>=0;--i){
            output[count[array[i]-'a']-1]=array[i];
            count[array[i]-'a']--;
        }

        StringBuilder sb = new StringBuilder();
        for(char a:output)
            sb.append(a);
        System.out.println(sb.toString());
        return output.toString();
    }
}
