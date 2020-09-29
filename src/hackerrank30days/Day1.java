package hackerrank30days;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        System.out.println("Input Integer value:");
        int j = scan.nextInt();
        System.out.println("Input Double value:");
        double e = scan.nextDouble();
        System.out.println("Input String value:");
        scan.nextLine();
        String t = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        int k = i + j;
        double f = d+e;
        f = Math.round(f*10)/10.0;
        String u = s + t;
        System.out.println(k);
        System.out.println(f);
        System.out.println(u);
        scan.close();

    }
}
