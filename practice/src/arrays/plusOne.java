package arrays;

public class plusOne {
    public static void main(String[] args) {
        System.out.println(plusOne(new int[]{1,2,3}));
    }

    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;--i){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newNumber=new int[digits.length+1];
        newNumber[0]=1;
        return newNumber;
    }
}
