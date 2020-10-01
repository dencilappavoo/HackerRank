/*Objective
        Today, we're learning and practicing an algorithmic concept called Recursion. Check out the Tutorial tab for learning materials and an instructional video!

        Recursive Method for Calculating Factorial

        Task
        Write a factorial function that takes a positive integer,
        as a parameter and prints the result of (

        factorial).

        Note: If you fail to use recursion or fail to name your recursive function factorial or Factorial, you will get a score of

        .

        Input Format

        A single integer,

        (the argument to pass to factorial).

        Constraints

        Your submission must contain a recursive function named factorial.

        Output Format

        Print a single integer denoting

        .

        Sample Input

        3

        Sample Output

        6*/

package hackerrank30days;

import java.util.Scanner;

public class Day9Recursion {
 static int recrusionResult=0;
    // Complete the factorial function below.
    static int factorial(int n) { // 4
        // result = 4 * 3 * 2 * 1 = 24;
        // result = n * factorial(n-1)
        if(n<=0)
        {
            return 1;
        }
        recrusionResult = n * factorial(n-1);
        return recrusionResult;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)  {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        int result = factorial(n);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();

    }


}

