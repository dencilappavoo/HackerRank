/*

Objective
Today's challenge puts your understanding of nested conditional statements to the test. You already have the knowledge to complete this challenge, but check out the Tutorial tab for a video on testing!

Task
Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:

    If the book is returned on or before the expected return date, no fine will be charged (i.e.:

.
If the book is returned after the expected return day but still within the same calendar month and year as the expected return date,
.
If the book is returned after the expected return month but still within the same calendar year as the expected return date, the
.
If the book is returned after the calendar year in which it was expected, there is a fixed fine of

    .

Input Format

The first line contains
space-separated integers denoting the respective , , and on which the book was actually returned.
The second line contains space-separated integers denoting the respective , , and

on which the book was expected to be returned (due date).

Constraints

Output Format

Print a single integer denoting the library fine for the book received as input.

Sample Input
9 6 2015
6 6 2015
Sample Output
45




*/

package hackerrank30days;
import java.time.LocalDate;
import java.util.*;


public class Day26NestedLogic {

    public static void main(String[] args) {
        //Sample Input //9 6 2015 //6 6 2015
        //Sample Output //45

        Scanner scanner = new Scanner(System.in); //
        String strActual = scanner.nextLine();
        String strExpected = scanner.nextLine();
        String[] actual = strActual.split(" ");
        String[] expected = strExpected.split(" ");
        int fine = 0;
        LocalDate dateActual = LocalDate.of(Integer.parseInt(actual[2]),Integer.parseInt(actual[1]),Integer.parseInt(actual[0]));
        LocalDate dateExpected = LocalDate.of(Integer.parseInt(expected[2]),Integer.parseInt(expected[1]),Integer.parseInt(expected[0]));
        if(dateActual.isAfter(dateExpected))
        {
            int yearDifference = dateActual.getYear() - dateExpected.getYear();
            int daysDifference = dateActual.getDayOfMonth() - dateExpected.getDayOfMonth();
            int monthDifference = dateActual.getMonthValue() - dateExpected.getMonthValue();
            if(yearDifference>0)
            {
                fine = 10000;
            }
            else if(monthDifference>0 && yearDifference==0)
            {
                fine = 500 * monthDifference;
            }
            else
                {
                    fine = 15 * daysDifference;
                }

        }
        System.out.println(fine);

    }
}
