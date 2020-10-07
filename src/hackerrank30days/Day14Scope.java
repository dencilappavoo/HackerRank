package hackerrank30days;

import java.util.Scanner;

public class Day14Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
        sc.close();
        int[] a = new int[]{1, 2, 5};
        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);

}
}
