package stack;

import java.util.Arrays;
import java.util.LinkedList;

public class StackReserverInt {
    public static void main(String[] args) {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        int[] arrayInt = {1,2,3,4,5};
        for (int i = 0; i <arrayInt.length ; i++) {
            stack.push(arrayInt[i]);
        }
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = stack.pop();
        }
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
        }
    }
