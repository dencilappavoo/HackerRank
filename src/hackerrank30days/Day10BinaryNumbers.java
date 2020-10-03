/*Objective
        Today, we're working with binary numbers. Check out the Tutorial tab for learning materials and an instructional video!

        Task
        Given a base-
        integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in

        's binary representation.

        Input Format

        A single integer,

        .

        Constraints

        Output Format

        Print a single base-
        integer denoting the maximum number of consecutive 's in the binary representation of

        .

        Sample Input 1

        5

        Sample Output 1

        1

        Sample Input 2

        13

        Sample Output 2

        2

        Explanation

        Sample Case 1:
        The binary representation of
        is , so the maximum number of consecutive 's is

        .

        Sample Case 2:
        The binary representation of
        is , so the maximum number of consecutive 's is .
        */

package hackerrank30days;
import java.util.Scanner;

public class Day10BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String output = "";
        while (n != 0) {
            output = n % 2 + output;
            n /= 2;
        }
        String[] outArray = output.split("0");
        int maxSize = 0;
        for(String str : outArray) {
            if (maxSize < str.length()) {
                maxSize = str.length();
            }
        }
        System.out.println(maxSize);
        scanner.close();
    }
}