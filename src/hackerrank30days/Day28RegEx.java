package hackerrank30days;

import java.lang.reflect.Array;
import java.util.*;

public class Day28RegEx {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        LinkedList<String> gmailNames = new LinkedList<>();
        String[] arrayNames = new String[N];
        int arrayCount = 0;

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            if(emailID.endsWith("@gmail.com"))
            {
                gmailNames.add(firstName);
                Array.set(arrayNames,arrayCount,firstName);
                ++arrayCount;
            }
        }
        scanner.close();
        Collections.sort(gmailNames);
        for(String name : gmailNames)
        {
            System.out.println(name);
        }

    }

}
