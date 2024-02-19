package recursion;

public class specialFibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(86,93,35));
    }
    static int fibonacci(int n, int a, int b){
        if(n==0){
            return a;
        }
        if(n==1)
            return b;
        if(n==2)
            return a^b;
        return fibonacci(n%3,a,b);
    }
}
