import java.util.Scanner;

public class DemSoLanXuatHienKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = scanner.nextLine();
        System.out.println("Enter chart");
        String chart = scanner.nextLine();
        char x =  chart.charAt(0);
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)== x ){
                count++;
            }
        }
        System.out.println(x+" appear "+ count+" times");
    }
}
