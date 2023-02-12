package stack;

import java.util.*;

public class PalindromeTest {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Able was I ere I saw Elba"));
    }
    public static boolean isPalindrome(String str){
        Stack<String> stackStr = new Stack<>();
        Queue<String> queueStr = new LinkedList<>();
        str = str.toLowerCase();
        String[] array = str.split("");
        for (int i = 0; i < array.length; i++) {
            stackStr.push(array[i]);
            queueStr.add(array[i]);
        }
        while(!stackStr.isEmpty()){
            if(!Objects.equals(stackStr.pop(), queueStr.remove())){
                return false;
            }
        }
        return true;
    }
}
