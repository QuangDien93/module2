package stack;

import java.util.Stack;

public class ConvertCenturyToBinary {
    public static void main(String[] args) {
        System.out.println(convert(11));
    }
    public static int convert (int num){
        Stack<Integer> stackBinary = new Stack<>();
        while (num/2 != 0){
            stackBinary.push(num % 2);
            num = num/2;
        }
        stackBinary.push(num);
        int result = 0;
        while (!stackBinary.isEmpty()){
            result = result*10 + stackBinary.pop();
        }
        return result;
    }
}
