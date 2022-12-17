import java.util.Scanner;

public class TongCotMang2Chieu {
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
        System.out.println("which colum do you want to sum?");
        int columSum = scanner.nextInt();
        System.out.println("the Sum result is:"+ calculateColum(array,columSum));
    }
    public static double calculateColum(double[][] array, int colum){
        double sumColum = 0;
        for (int i = 0; i <array.length ; i++) {
            sumColum += array[i][colum];
            }
        return sumColum;
        }
    }

