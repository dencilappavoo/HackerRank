package hackerrank30days;

import java.util.Arrays;

class Calculator implements AdvancedArithmetic
{
    public static void main(String[] args) {}

    int power(int n,int p) throws Exception
    {
        if(n<0 || p<0){
            throw new Exception("n and p should be non-negative");
        }
        else
            {
            return (int)Math.pow(n,p);
        }
    }

    public int divisorSum(int n) {
        int[] divisors = new int[n];
        int divisorsCount = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                divisors[divisorsCount]=i;
                ++divisorsCount;
            }
        }
        return Arrays.stream(divisors).sum();

    }

}

