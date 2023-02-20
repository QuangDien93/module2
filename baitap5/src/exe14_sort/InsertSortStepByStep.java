package exe14_sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertSortStepByStep {
        public static void main(String[] args) {
            int[] array = {5,4,2,4,7,9,8,1};
            System.out.println("Danh sách ban đầu:" + Arrays.toString(array));
            insertSortStepByStep(array);
            System.out.println("Danh sách sau sắp xếp" + Arrays.toString(array));
        }
    public static void insertSortStepByStep(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    System.out.println(array[j]+" < "+array[j-1]+" thực hiện đổi chổ.");
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                } else {

                    System.out.println(array[j]+" >= "+array[j-1]+" dừng kiểm tra");
                    System.out.println("Danh sách lúc này là: "+ Arrays.toString(array));
                    break;
                }
            }
        }
    }
}
