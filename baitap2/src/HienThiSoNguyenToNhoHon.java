import java.util.Scanner;

public class HienThiSoNguyenToNhoHon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Display the number of prime number less than: ");
        int lessThanNum = scanner.nextInt();
        for (int i = 2; i < lessThanNum; i++) {
            if (isPrime(i)) {
                System.out.print(i +" ");
            }
        }
    }
    public static boolean isPrime (int num) {
        boolean check = true;
        if (num < 2) {
            check = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}
