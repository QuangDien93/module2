package exe14_sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 2, 4, 7, 9, 8, 1};
        System.out.println("Danh sách ban đầu:" + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Danh sách sau sắp xếp" + Arrays.toString(array));
    }
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
