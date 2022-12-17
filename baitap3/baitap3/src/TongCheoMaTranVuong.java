import java.util.Scanner;

public class TongCheoMaTranVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The length of Array 2D:");
        int angle = scanner.nextInt();
        double[][] array = new double[angle][angle];
        for (int i = 0; i <angle ; i++) {
            for (int j = 0; j < angle; j++) {
                System.out.println("the element ["+i+"]["+j+"]:");
                array[i][j] = scanner.nextInt();
            }
        }
        double sum= 0;
        for (int i = 0; i < angle; i++) {
            for (int j = 0; j < angle; j++) {
                if((j==i) || (j == angle-1-i)){
                    sum+= array[i][j];
                }
            }
        }
        System.out.println("the sum 2 cross line is: "+ sum);
    }
}
