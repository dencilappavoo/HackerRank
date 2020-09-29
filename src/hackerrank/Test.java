package hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Test {
int test_a, test_b;
    Test(int a, int b)
    {
        test_a = a;
        test_b = b;
    }

     Test()
    {
        System.out.println("I'm a Test Constructor");
    }

    public String GetMe()
    {
        System.out.println("I'm string ");
        return "I'm string";
    }

    public String GetMe(Integer withNumber)
    {
        System.out.println("I'm string ");
        return withNumber.toString();
    }
}

 class VoidMain {
    public static void main(String[] args) {
        // Test test = new Test(1,2);
        Test test1 = new Test();
        StringOperations stringOperations = new StringOperations();
        System.out.println(stringOperations.findSubstring("caberqiitefg",5));
        System.out.println(stringOperations.findSubstring("vowelsaeioucount",5));
        System.out.println(stringOperations.findSubstring("vowelsaeioucount",5));
        System.out.println(stringOperations.findSubstring("aeoibsddaeiouudb",5));
        //System.out.println(test.test_a + " " + test.test_b);
    }

     /*public static String findSubstring(String s, int k) {
         // Write your code here
        char[] vowels = {'a','e','i','o','u'};
        HashSet<Character> hsVowels = new HashSet<Character>();
        hsVowels.add('a');hsVowels.add('e');hsVowels.add('i');hsVowels.add('o');hsVowels.add('u');
        String subString, subStringCheck=null;
        int vowelCount=0, vowelCountCheck=0,strLength=s.length();
        for(int i=0;k<=(strLength-i);i++) // i<strLength-1
        {
            vowelCount = 0;
            //if(k <= (strLength-i)) {
                subString = s.substring(i, (k+i)); //caberqiitefg
                for (char c : subString.toCharArray()) {
                    if (hsVowels.contains(c)) {
                        vowelCount = vowelCount + 1;
                    }
                }
                if (i == 0 || (vowelCount > vowelCountCheck)) {
                    vowelCountCheck = vowelCount;
                    subStringCheck = subString;
                }
            //}
        }
        return subStringCheck;
    } */


}
