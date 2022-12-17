import java.util.Scanner;

public class MangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The row of Array:");
        int row = scanner.nextInt();
        System.out.println("The colum of Array:");
        int colum = scanner.nextInt();
        double[][] array = new double[row][colum];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("the element ["+i+"]["+j+"]:");
                array[i][j] = scanner.nextInt();
            }
        }
        double max = array[0][0];
        int indexRow =0;
        int indexColum = 0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if(array[i][j] > max){
                    max = array[i][j];
                    indexRow = i;
                    indexColum = j;
                }
            }
        }
        System.out.println("the max is: "+ max+" index is: ["+indexRow+"]["+indexColum+"]");
    }
}
