package topcoder;

public class Mathematics {
    public static void main(String[] args) {
        Mathematics.isPrime(7);

    }

    public static boolean isPrime(int n){
        boolean boolIsPrime = false;
        if(n <= 1) boolIsPrime = false;
        if(n==2) boolIsPrime = true;
        if(n%2 == 0) boolIsPrime = false;
        double m = Math.sqrt(n);
        for(int i=3;i<=m;i += 2){
            if(n %i == 0) {boolIsPrime = false;}

        boolIsPrime = true;
        }

        return boolIsPrime;
    }
}
