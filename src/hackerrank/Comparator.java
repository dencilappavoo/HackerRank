package hackerrank;

import java.util.Arrays;

public class Comparator {
    public static void main(String[] args) {
        try
        {
            Float f1 = new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x + b + d);
        }
        catch (NumberFormatException e) /* Line 9 */
        {
            System.out.println("bad number"); /* Line 11 */
        }
    }

    static boolean compare(int i, int j)
    {
        return i == j;
    }
    static boolean compare(String a, String b){
        return a.equals(b);
    }
    static boolean compare(int[] k, int[] l)
    {
        return Arrays.equals(k, l);
    }
}
