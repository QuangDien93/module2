package map;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String inputStr = scanner.nextLine();
        String[] arrayStr = inputStr.split(" ");
        System.out.println(Arrays.toString(arrayStr));
        TreeMap <String, Integer> treeMapStr = new TreeMap();
        for (int i = 0; i < arrayStr.length; i++) {
            if(treeMapStr.containsKey(arrayStr[i])){
                Integer value = treeMapStr.get(arrayStr[i]);
                value++;
                treeMapStr.replace(arrayStr[i], value);
            } else {
                treeMapStr.put(arrayStr[i],1);
            }
        }
        System.out.println(treeMapStr.toString());
    }
}
