import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Prime number do you want to display?");
        int countPrime = sc.nextInt();
        int index = 0;
        for (int i = 2; index < countPrime; i++) {
            if (isPrime(i)) {
                System.out.print(i +" ");
                index++;
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
