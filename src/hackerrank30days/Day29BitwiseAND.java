/*
Objective
Welcome to the last day! Today, we're discussing bitwise operations. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given set
. Find two integers, and (where ), from set such that the value of is the maximum possible and also less than a given integer, . In this case,

represents the bitwise AND operator.

Input Format

The first line contains an integer,
, the number of test cases.
Each of the subsequent lines defines a test case as space-separated integers, and

, respectively.

Constraints

Output Format

For each test case, print the maximum possible value of A&B on a new line.

Sample Input

3
5 2
8 5
2 2

Sample Output

1
4
0



*/

package hackerrank30days;
import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day29BitwiseAND {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int maxValue = 0;
            String[] nk = scanner.nextLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            if ((k-1 | k) <= n) {
                System.out.println(k-1);
            }
            else {
                System.out.println(k-2);
            }

        }
        scanner.close();
    }
    // S = {1,2,3,4,5,6,7,8}
    // K = 5

    //      1. Find Integers A < B
    //          i)      From Set S
    //          ii)     A & B is maximum possible value. Bitwise AND operator
    //          iii)    Less than given Integer K.
    //          1
    //
    //
    //
    //
    //

}




































