package exe13_search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiTangDanLonNhat {
    public static void main(String[] args) {
        findMaxStringIncrease("Welcome ");
    }

    public static void findMaxStringIncrease(String s) {
        ArrayList<Character> max = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            LinkedList<Character> tempList = new LinkedList<>();
            tempList.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) > tempList.getLast()) {
                    tempList.add(s.charAt(j));
                }
            }
            if (tempList.size() > max.size()) {
                max.clear();
                max.addAll(tempList);
            } else {
                tempList.clear();
            }
        }
        for (Character element : max) {
            System.out.print(element);
        }
    }
}
