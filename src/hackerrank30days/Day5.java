package hackerrank30days;

import java.util.Scanner;

public class Day5 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int i=0;
        while(i<=10)
        {
            System.out.println(n+" x "+ i + " = "+(n*i));
            i++;
        }
        scanner.close();
    }
}
