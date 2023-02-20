package exe13_search;

import queue.Node;

import java.util.Arrays;

public class BinarySearch {

    public static final int NOT_FOUND = -1;

    public static void main(String[] args) {
        int[] arrayInt = {1, 3, 2, 5, 7, 4, 8};
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = i + 1; j < arrayInt.length; j++) {
                if (arrayInt[j] < arrayInt[i]) {
                    int temp = arrayInt[j];
                    arrayInt[j] = arrayInt[i];
                    arrayInt[i] = temp;
                }
            }
        }
        System.out.println(binarySearch(arrayInt, 0, 6, 3));
    }

    public static int binarySearch(int[] array, int begin, int end, int value) {

        int middle = (begin + end) / 2;
        if (begin>end){
            return NOT_FOUND;
        }
        if (array[middle] == value) {
            return middle;
        } else {
            if (array[middle] < value) {
               return binarySearch(array, middle + 1, end, value);
            } else {
                return binarySearch(array, 0, middle + 1, value);
            }
        }
    }
}
