package recursion;

import java.util.ArrayList;
import java.util.Collections;

public class phoneNumberPermutations {
    static Character  numberToCharMap[][];
    public static void generateNumberToCharMap(){
        numberToCharMap=new Character[10][5];
        numberToCharMap[0]=new Character[]{};
        numberToCharMap[1]=new Character[]{};
        numberToCharMap[2]=new Character[]{'a','b','c'};
        numberToCharMap[3]=new Character[]{'d','e','f'};
        numberToCharMap[4]=new Character[]{'g','h','i'};
        numberToCharMap[5]=new Character[]{'j','k','l'};
        numberToCharMap[6]=new Character[]{'m','n','o'};
        numberToCharMap[7]=new Character[]{'p','q','r','s'};
        numberToCharMap[8]=new Character[]{'t','u','v'};
        numberToCharMap[9]=new Character[]{'w','x','y','z'};
    }

    public static ArrayList<String> phoneNumberString(int[] num,int index,String p){
        if(num.length==index){
            return new ArrayList<>(Collections.singleton(p));
        }
        ArrayList<String> res=new ArrayList<>();
        Character charc[]=numberToCharMap[num[index]];
        for(Character c:charc){
            res.addAll(phoneNumberString(num,index+1,p+c));
        }
        return res;
    }

    public static void print(int[] num){
        generateNumberToCharMap();
        ArrayList<String> res=phoneNumberString(num,0,"");
        System.out.println(res);
    }

    public static void main(String[] args) {
        print(new int[]{2,3,4});

    }


}
