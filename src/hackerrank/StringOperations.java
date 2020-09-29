package hackerrank;

import java.util.HashSet;

public class StringOperations {
    public String findSubstring(String s, int k) {
        char[] vowels = {'a','e','i','o','u'};
        HashSet<Character> hsVowels = new HashSet<Character>();
        hsVowels.add('a');hsVowels.add('e');hsVowels.add('i');hsVowels.add('o');hsVowels.add('u');
        String subString, subStringCheck=null;
        int vowelCount=0, vowelCountCheck=0,strLength=s.length();
        for(int i=0;k<=(strLength-i);i++) // i<strLength-1
        {
            vowelCount = 0;
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
        }
        return subStringCheck;
    }
}
