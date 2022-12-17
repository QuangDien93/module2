import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choise:\n" +
                "1. Print the rectangle\n" +
                "2. Print the square triangle\n" +
                "3. Print isosceles triangle\n" +
                "4. Exit");
        int choise = scanner.nextInt();
        while(choise != 4){
            if(choise == 1){
                System.out.printf("the hight is: ");
                int hight = scanner.nextInt();
                System.out.printf("the width is: ");
                int width = scanner.nextInt();
                for (int i = 0; i < hight; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("* ");
                    }
                    System.out.printf("\n");
                }
                break;
            } else {
                if(choise==3){
                    System.out.println("the lenght of Angle is: ");
                    int angleIsoscele = scanner.nextInt();
                    int angleBottom  = angleIsoscele*2-1;
                    for (int i = 0; i <angleIsoscele ; i++) {
                        for (int j = 0; j < angleBottom; j++) {
                            if(j> (angleIsoscele-i) && j< (angleIsoscele+i)){
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                } else {
                    if(choise==2){
                        System.out.println("the angle of triangle is: ");
                        int angletri = scanner.nextInt();
                        System.out.println("the topleft triangle:");
                        for (int i = 0; i < angletri; i++) {
                            for (int j = 0; j < angletri-i; j++) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                        System.out.print("\n");
                        System.out.println("the topright triangle:");
                        for (int k = 0; k < angletri; k++) {
                            for (int l = 0; l <angletri ; l++) {
                                if(l >= k){
                                    System.out.print("*");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                            System.out.print("\n");
                        }
                        System.out.print("\n");
                        System.out.println("the bottonleft triangle:");
                        for (int m = 0; m < angletri; m++) {
                            for (int n = 0; n <= m; n++) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                        System.out.print("\n");
                        System.out.println("the bottonright triangle:");
                        for (int u = 0; u < angletri; u++) {
                            for (int v = 0; v < angletri; v++) {
                                if(v >= (angletri-u-1)){
                                    System.out.print("*");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                            System.out.print("\n");
                        }
                        break;
                    }
                }
            }
        }
    }
}