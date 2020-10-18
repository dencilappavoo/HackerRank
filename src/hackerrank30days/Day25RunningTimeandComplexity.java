/*

Objective
Today we're learning about running time! Check out the Tutorial tab for learning materials and an instructional video!

Task
A prime is a natural number greater than
that has no positive divisors other than and itself. Given a number, , determine and print whether it's or

.

Note: If possible, try to come up with a
primality algorithm, or see what sort of optimizations you come up with for an

algorithm. Be sure to check out the Editorial after submitting your code!

Input Format

The first line contains an integer,
, the number of test cases.
Each of the subsequent lines contains an integer,

, to be tested for primality.

Constraints

Output Format

For each test case, print whether
is or

on a new line.

Sample Input

3
12
5
7

Sample Output

Not prime
Prime
Prime



Sample more tests:
30

1

4

9

16

25

36

49

64

81

100

121

144

169

196

225

256

289

324

361{-truncated-}
*/
package hackerrank30days;

import java.util.Scanner;

public class Day25RunningTimeandComplexity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0) {
            int element=scan.nextInt();
            if(isPrime(element))
            {System.out.println("Prime");}
            else {System.out.println("Not prime");}
        }
    }

    static boolean isPrime(int n) {
        if(n==2 || n==3) return true;
        if (n==0 || n==1 || n%2==0) return false;
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
