package dk.jhaaf.jakob.opgave310;

/**
 * Created by jakob on 14-09-16.
 */
public class OpgaveB {
    public static void main(String[] args) {
        System.out.println(binomial(20, 10));

    }

    public static int binomial(int n, int k){
        return (int) (factorial(n)/(factorial(k)*factorial(n-k)));
    }

    public static long factorial(long n){
        if (n > 1) {
            return n * (factorial(n - 1));
        }else{
            return 1;
        }
    }
}
