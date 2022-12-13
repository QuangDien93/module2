import java.util.Scanner;

public class SoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your int number from 0 to 999: ");
        int numberInput = scanner.nextInt();
        if(numberInput<100){
            numberLessThan100(numberInput);
        } else {
            int hundresses = numberInput/100;
            int tens = numberInput % 100;
            switch (hundresses){
                case 1:
                    System.out.print("One Hundress  and ");
                    numberLessThan100(tens);
                case 2:
                    System.out.print("Two Hundress  and ");
                    numberLessThan100(tens);
                case 3:
                    System.out.print("Three Hundress  and ");
                    numberLessThan100(tens);
                case 4:
                    System.out.print("Four Hundress  and ");
                    numberLessThan100(tens);
                case 5:
                    System.out.print("Five Hundress  and ");
                    numberLessThan100(tens);
                case 6:
                    System.out.print("Six Hundress  and ");
                    numberLessThan100(tens);
                case 7:
                    System.out.print("Seven Hundress  and ");
                    numberLessThan100(tens);
                case 8:
                    System.out.print("Eight Hundress  and ");
                    numberLessThan100(tens);
                case 9:
                    System.out.print("Nine Hundress  and ");
                    numberLessThan100(tens);
            }
        }
    }

    public static void numberLessThan100(int num) {
        String numberRead100 = null;
        if (num < 10) {
            switch (num) {
                case 0:
                    numberRead100 = "Zero";
                    break;
                case 1:
                    numberRead100 = "One";
                    break;
                case 2:
                    numberRead100 = "two";
                    break;
                case 3:
                    numberRead100 = "three";
                    break;
                case 4:
                    numberRead100 = "four";
                    break;
                case 5:
                    numberRead100 = "five";
                    break;
                case 6:
                    numberRead100 = "Six";
                    break;
                case 7:
                    numberRead100 = "Seven";
                    break;
                case 8:
                    numberRead100 = "eight";
                    break;
                case 9:
                    numberRead100 = "nine";
                    break;
            }
        } else {
            if (num < 20) {
                switch (num) {
                    case 10:
                        numberRead100 = "ten";
                        break;
                    case 11:
                        numberRead100 = "eleven";
                        break;
                    case 12:
                        numberRead100 = "twelve";
                        break;
                    case 13:
                        numberRead100 = "thirteen";
                        break;
                    case 14:
                        numberRead100 = "fourteen";
                        break;
                    case 15:
                        numberRead100 = "fifteen";
                        break;
                    case 16:
                        numberRead100 = "Sixteen";
                        break;
                    case 17:
                        numberRead100 = "eleven";
                        break;
                }
            } else {
                if (num < 100) {
                    int onesNum = num % 10;
                    int tensNum = num / 10;
                    switch (tensNum) {
                        case 2:
                            numberRead100 = "tenwty";
                            break;
                        case 3:
                            numberRead100 = "thirty";
                            break;
                        case 4:
                            numberRead100 = "fourty";
                            break;
                        case 5:
                            numberRead100 = "fifty";
                            break;
                        case 6:
                            numberRead100 = "Sixty";
                            break;
                        case 7:
                            numberRead100 = "Seventy";
                            break;
                        case 8:
                            numberRead100 = "Eighty";
                            break;
                        case 9:
                            numberRead100 = "ninety";
                            break;
                    }
                    switch (onesNum) {
                        case 1:
                            numberRead100 += " one";
                            break;
                        case 2:
                            numberRead100 += " Two";
                            break;
                        case 3:
                            numberRead100 += " three";
                            break;
                        case 4:
                            numberRead100 += " four";
                            break;
                        case 5:
                            numberRead100 += " five";
                            break;
                        case 6:
                            numberRead100 += " six";
                            break;
                        case 7:
                            numberRead100 += " seven";
                            break;
                        case 8:
                            numberRead100 += " eight";
                            break;
                        case 9:
                            numberRead100 += " nine";
                            break;
                    }
                }
            }
        }
        System.out.print(numberRead100);
    }
}
