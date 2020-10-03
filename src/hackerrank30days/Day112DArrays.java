/*
Objective
        Today, we're building on our knowledge of Arrays by adding another dimension. Check out the Tutorial tab for learning materials and an instructional video!

        Context
        Given a
        2D Array,

        :

        1 1 1 0 0 0
        0 1 0 0 0 0
        1 1 1 0 0 0
        0 0 0 0 0 0
        0 0 0 0 0 0
        0 0 0 0 0 0

        We define an hourglass in
        to be a subset of values with indices falling in this pattern in

        's graphical representation:

        a b c
        d
        e f g

        There are
        hourglasses in

        , and an hourglass sum is the sum of an hourglass' values.

        Task
        Calculate the hourglass sum for every hourglass in

        , then print the maximum hourglass sum.

        Input Format

        There are
        lines of input, where each line contains space-separated integers describing 2D Array ; every value in will be in the inclusive range of to

        .

        Constraints

        Output Format

        Print the largest (maximum) hourglass sum found in

        .

        Sample Input

        1 1 1 0 0 0
        0 1 0 0 0 0
        1 1 1 0 0 0
        0 0 2 4 4 0
        0 0 0 2 0 0
        0 0 1 2 4 0

        Sample Output

        19

        Explanation

        contains the following hourglasses:

        1 1 1   1 1 0   1 0 0   0 0 0
        1       0       0       0
        1 1 1   1 1 0   1 0 0   0 0 0

        0 1 0   1 0 0   0 0 0   0 0 0
        1       1       0       0
        0 0 2   0 2 4   2 4 4   4 4 0

        1 1 1   1 1 0   1 0 0   0 0 0
        0       2       4       4
        0 0 0   0 0 2   0 2 0   2 0 0

        0 0 2   0 2 4   2 4 4   4 4 0
        0       0       2       0
        0 0 1   0 1 2   1 2 4   2 4 0

        The hourglass with the maximum sum (

        ) is:

        2 4 4
        2
        1 2 4
*/

package hackerrank30days;
import java.util.Scanner;





public class Day112DArrays {

    static int hourGlassSum(int[][] arr){
    int rows = arr.length;
    int columns = arr[0].length;
    int max_hourglass_sum = -63;
    for(int i=0;i<rows-2;i++)
    {
        for(int j=0;j<columns-2;j++)
        {
            int currentHourGlassSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] +
                    arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
            max_hourglass_sum = Math.max(max_hourglass_sum,currentHourGlassSum);
        }
    }
    return max_hourglass_sum;
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        System.out.println(hourGlassSum(arr));
        scanner.close();
    }

}
