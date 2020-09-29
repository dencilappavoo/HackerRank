/*

Objective
Today we're expanding our knowledge of Strings and combining it with what we've already learned about loops. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given a string,
, of length that is indexed from to , print its even-indexed and odd-indexed characters as

space-separated strings on a single line (see the Sample below for more detail).

Note:

is considered to be an even index.

Input Format

The first line contains an integer,
(the number of test cases).
Each line of the subsequent lines contain a String,

.

Constraints

Output Format

For each String
(where ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed characters.

Sample Input

2
Hacker
Rank

Sample Output

Hce akr
Rn ak

 */

package hackerrank30days;

import java.util.Scanner;

public class Day6 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int indices = scanner.nextInt();
        String[] splitString = new String[indices];
        String[] inputString = new String[indices];
        scanner.nextLine();
        for(int i=0;i<indices;i++)
        {
            inputString[i]=scanner.nextLine();
            String firstSplit = new String(), secondSplit= new String();
            int j=0;
            for(Character c: inputString[i].toCharArray())
            {
                if(j==0 || (j%2==0))
                {
                    firstSplit +=   c.toString();
                }
                if(j%2==1)
                {
                    secondSplit +=  c.toString();
                }
                j = j+1;
            }
            splitString[i] = firstSplit + " " + secondSplit;
        }
        for (String str: splitString) {
            System.out.println(str);
        }
}
}
