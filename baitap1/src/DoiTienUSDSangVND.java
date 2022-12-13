import java.util.Scanner;

public class DoiTienUSDSangVND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of USD: ");
        int numUSD = scanner.nextInt();
        final double TIGIAUSD_VND = 23000;
        double numVND = numUSD*TIGIAUSD_VND;
        System.out.println("the number of VND is: "+ numVND);
    }
}
