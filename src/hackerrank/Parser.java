package hackerrank;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Parser {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(isBalanced(in.next()));
        }
        in.close();
    }
    static HashMap<Character,Character> bMap;
    static {
        bMap = new HashMap<>();
        bMap.put('(',')');
        bMap.put('[',']');
        bMap.put('{','}');
    }

    static boolean isBalanced(String str){
        boolean isStringBalanced = true;
        if(str.length() %2 !=0) {
            isStringBalanced = false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<=str.length();i++)
        {
            Character character = str.charAt(i);
            if(bMap.containsKey(character)){
                stack.push(character);
            }
            else if(stack.empty() || character != bMap.get(stack.pop())){
                isStringBalanced = false;
            }
        }
        return isStringBalanced;
    }
}
