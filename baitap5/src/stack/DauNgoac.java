package stack;

import java.util.Stack;

public class DauNgoac {
    public static void main(String[] args) {
        System.out.println(isBracketWell("s * (s – a) * (s – b * (s – c)"));
    }
    public static boolean isBracketWell(String str){
        byte[] bytes = str.getBytes();
        Stack<Character> stackChar = new Stack<>();
        for(byte element: bytes){
            if((char) element == '('){
                stackChar.push('(');
                continue;
            }
            if ((char) element == ')'){
                if (stackChar.pop() != '(') {
                    return false;
                }
            }
        }
        return stackChar.isEmpty();
    }
}
