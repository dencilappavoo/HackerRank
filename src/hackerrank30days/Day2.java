package hackerrank30days;

import java.util.Scanner;

public class Day2 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
     //double totalBill =  meal_cost + (meal_cost * 0.2) + (meal_cost * 0.08 );
            double tip = ((meal_cost*tip_percent)/100) ;
            double tax = ((meal_cost*tax_percent)/100);
            double totalBill = meal_cost + tip + tax;
            System.out.println((int) Math.round(totalBill));
    }
}
